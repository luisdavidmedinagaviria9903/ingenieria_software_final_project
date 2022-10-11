package com.ingenieria.software.demo.repository;

import com.ingenieria.software.demo.domain.Sickness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SicknessRepository extends JpaRepository<Sickness, Long> {
}
