package com.sgic.internal.defecttracker.project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.sgic.common.api.enums.RestApiResponseStatus;
import com.sgic.common.api.response.ApiResponse;
import com.sgic.internal.defecttracker.project.controller.dto.ModuleDto;
import com.sgic.internal.defecttracker.project.controller.dtomapper.ModuleDtoMapper;


//import com.sgic.internal.defecttracker.project.repositories.ModuleRepository;

@RestController
public class ModuleController {
	
//	private static Logger logger =LogManager.getLogger(ModuleRepository.class);

	@Autowired
	public ModuleDtoMapper moduleDtoMapper;
	
	@PostMapping(value="/createmodule")
	public ResponseEntity<Object>createModule (@RequestBody ModuleDto moduleDto){
		moduleDtoMapper.saveModuleforMapper(moduleDto);
		return new ResponseEntity<>(new ApiResponse(RestApiResponseStatus.OK), HttpStatus.OK);
	
}
}
