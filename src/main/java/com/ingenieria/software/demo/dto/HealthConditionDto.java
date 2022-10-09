package com.ingenieria.software.demo.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class HealthConditionDto implements Serializable {

    private static final long serialVersionUID = -9085044514133145001L;
    private Long id;
    private UserDto user;
}
