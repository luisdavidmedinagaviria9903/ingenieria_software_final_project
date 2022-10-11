package com.ingenieria.software.demo.repository;

import com.ingenieria.software.demo.domain.UserFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFamilyRepository  extends JpaRepository<UserFamily, Long> {

    List<UserFamily> findAllByUser_Email(String userEmail);
}
