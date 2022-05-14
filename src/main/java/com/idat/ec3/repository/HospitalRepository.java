package com.idat.EV03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EV03.model.Hospital;
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
