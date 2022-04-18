package com.souza.InciUol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.souza.InciUol.model.Incidente;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Integer>{

}
