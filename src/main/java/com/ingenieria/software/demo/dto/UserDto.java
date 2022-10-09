package com.ingenieria.software.demo.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class UserDto implements Serializable {

    private static final long serialVersionUID = -7962938485129537147L;
    private Long id;
    private String email;
    private String fullName;
    private String password;
    private String userName;
}
