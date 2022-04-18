package com.souza.InciUol.dto;

import java.time.DayOfWeek;
import java.time.LocalDate;

import com.souza.InciUol.model.Incidente;

public class IncidenteDto {
	
	private String nome;
	private String data;

	public IncidenteDto(Incidente incidente) {;
		this.nome = incidente.getNome();
		this.data = formatDate(incidente.getData());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	private String formatDate(LocalDate data) {
		
		int ordinalSemana = data.getDayOfWeek().getValue();
		String diaSemana = DayOfWeek.of(ordinalSemana).toString();
		
		int ordinalDiaMes = data.getDayOfMonth();
		int ordinalMes = data.getMonthValue();
		
		String dateFormat = diaSemana + " (" + ordinalDiaMes + "/" + ordinalMes + ")";
		
		return dateFormat;
	}
	
}
