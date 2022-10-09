package com.ingenieria.software.demo.dto;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class UserCredentialsDto {
    private String email;
    private String password;
}
