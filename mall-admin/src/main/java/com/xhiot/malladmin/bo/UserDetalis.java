package com.xhiot.malladmin.bo;
import com.xhiot.mall.mallmbg.model.User;
import com.xhiot.mall.mallmbg.model.UserPermission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@ClassName UserDetalis
 * Create by Liuyq on 2019/12/12 9:06
 **/
public class UserDetalis implements UserDetails {

    private User user;
    private List<UserPermission> permissionList;

    public UserDetalis(User user, List<UserPermission> permissionList) {
        this.user = user;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return permissionList.stream()
                .filter(userPermission -> userPermission.getValue()!=null)
                .map(userPermission -> new SimpleGrantedAuthority(userPermission.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getStatus().equals(1);
    }
}
