package com.bendiamand.cabas.repository;

import com.bendiamand.cabas.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
}
