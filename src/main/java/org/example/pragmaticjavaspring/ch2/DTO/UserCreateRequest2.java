package org.example.pragmaticjavaspring.ch2.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest2 {

    private String username;
    private String password;
    private String email;
    private String address;
    private String gender;
    private int age;
}

// 멤버 변수를 private으로 선언했는데 getter와 setter를 만들어 사용한다면, private 선언이 무슨 소용인가?