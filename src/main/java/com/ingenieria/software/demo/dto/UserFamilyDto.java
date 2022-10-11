package com.ingenieria.software.demo.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class UserFamilyDto implements Serializable {
    private static final long serialVersionUID = -9166183345318357519L;
    private Long id;
    private UserDto user;
    private String name;
    private String email;
    private String phone;
}
