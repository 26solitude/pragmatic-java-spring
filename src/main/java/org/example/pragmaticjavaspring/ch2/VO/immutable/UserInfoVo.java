package org.example.pragmaticjavaspring.ch2.VO.immutable;

import lombok.Getter;

@Getter
public class UserInfoVo {

    private final long id;
    private final String username;
    private final String password;
    private final String email;

    public UserInfoVo(long id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
