package com.Jwtexp.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class User{
    private String userId;
    private String name;
    private String email;
}
