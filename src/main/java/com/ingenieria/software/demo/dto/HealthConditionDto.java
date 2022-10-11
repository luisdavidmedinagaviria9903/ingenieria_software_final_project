package com.ingenieria.software.demo.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class HealthConditionDto implements Serializable {

    private static final long serialVersionUID = -9085044514133145001L;
    private Long id;
    private Long user;
    private Long sicknessCode;
    private LocalDateTime creationDate;
    private Boolean isFamily;
}
