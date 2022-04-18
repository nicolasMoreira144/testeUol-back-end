package com.souza.InciUol.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souza.InciUol.IncidenteDto;
import com.souza.InciUol.repository.IncidenteRepository;

@Service
public class IncidenteService {
	
	@Autowired
	private IncidenteRepository incidenteRepository;
	
	public List<IncidenteDto> listar() {
		return incidenteRepository.findAll().stream().map(i -> new IncidenteDto(i)).collect(Collectors.toList());
	}
}
