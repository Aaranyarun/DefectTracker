package com.sgic.internal.defecttracker.project.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.project.entities.Module;
import com.sgic.internal.defecttracker.project.repositories.ModuleRepository;
import com.sgic.internal.defecttracker.project.services.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepository;
	
	@Override
	public Module createModule(Module module) {
		Module responseModule = moduleRepository.save(module);
		return responseModule;
	}

	

	@Override
	public void deleteById(String moduleid) {
		moduleRepository.getByModuleId(moduleid);
		
	}


	@Override
	public Module getByModuleId(String moduleid) {
		return moduleRepository.getByModuleId(moduleid);
	}

	@Override
	public List<Module> getBymoduleName(String name) {
		return moduleRepository.getBymoduleName(name);
	}



	@Override
	public boolean isModuleAlreadyExists(String moduleid) {
		return moduleRepository.exists(moduleid);
	}



	@Override
	public List<Module> getallDetails() {
		return moduleRepository.findAll();
	}



	@Override
	public Module updateModule(String moduleid, Module module) {
		if (moduleRepository.getOne(moduleid)!= null) {
			module.setModuleId(moduleid);
			moduleRepository.save(module);
		}
		return module;
	}
}


