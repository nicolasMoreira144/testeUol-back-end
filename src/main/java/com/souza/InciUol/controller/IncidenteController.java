package com.souza.InciUol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.souza.InciUol.dto.IncidenteDto;
import com.souza.InciUol.service.IncidenteService;


@RestController
@RequestMapping("incidentes")
public class IncidenteController {
	
	@Autowired
	private IncidenteService incidenteService;
	
	@CrossOrigin(origins = "http://localhost:4200")

	@GetMapping
	public ResponseEntity<List<IncidenteDto>> listar2() {
		List<IncidenteDto> incidentesDto = incidenteService.listar();

		return ResponseEntity.ok(incidentesDto);
	}

}
