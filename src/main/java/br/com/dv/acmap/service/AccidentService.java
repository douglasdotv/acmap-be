package br.com.dv.acmap.service;

import br.com.dv.acmap.dto.AccidentDTO;

import java.util.List;

public interface AccidentService {

    List<AccidentDTO> getAllAccidents();

    List<String> getOperators();

    List<String> getAircraftTypes();

    List<String> getCategories();

}
