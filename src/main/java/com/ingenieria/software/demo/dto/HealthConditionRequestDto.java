package com.ingenieria.software.demo.dto;


import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class HealthConditionRequestDto {

    private Long sicknessCode;
    private Boolean isFamily;
    private String userEmail;
    private String sicknessDescription;
    private Long userId;

}
