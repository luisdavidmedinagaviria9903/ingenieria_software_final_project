package com.ingenieria.software.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "condiciones_salud")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthCondition implements Serializable {

    private static final long serialVersionUID = -6782104243507511216L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user")
    private Long user;

    @Column(name = "sickness_code")
    private Long sicknessCode;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "is_family")
    private Boolean isFamily;




}
