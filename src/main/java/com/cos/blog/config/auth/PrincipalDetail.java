package com.cos.blog.config.auth;

import com.cos.blog.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayDeque;
import java.util.Collection;
// 로그인 요청 -> 로그인 진행 후 UserDetailis 타입의 오브젝트를 시큐리티의 고유한 세션 저장소에 저장함.
public class PrincipalDetail implements UserDetails {
    private User user; // 객체 품고 있다. : 콤포지션

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    //계정이 만료 되지 않았는지 리턴합니다. (true: 만료안됨)
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    //계정이 만료 되지 않았는지 리턴합니다. (true: 만료안됨)
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //계정이 활성화(사용가능)인지 리턴 (true : 활성화)
    @Override
    public boolean isEnabled() {
        return true;
    }
    // 계정이 갖고 있는 권한 목표를 리턴한다. (권한이 여러개 있을 수 있어서 루프를 돌아야하는데 우린 한개만.)
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collectors = new ArrayDeque<>();
        collectors.add(()->{ return "ROLE_" + user.getRole();});
        return collectors;



    }
}
