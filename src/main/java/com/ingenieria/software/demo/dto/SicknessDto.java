package com.ingenieria.software.demo.dto;


import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class SicknessDto {

    private Long id;
    private String description;
}
