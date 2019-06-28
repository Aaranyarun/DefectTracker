package com.sgic.internal.defecttracker.project.services;

import java.util.List;

import com.sgic.internal.defecttracker.project.entities.Module;

public interface ModuleService {
	public Module createModule(Module module);

	public boolean isModuleAlreadyExists(String moduleid);

	public List<Module> getallDetails();

	public void deleteById(String moduleid);

	public Module updateModule(String moduleid, Module module); // Update moduleid

	Module getByModuleId(String moduleid);

	public List<Module> getBymoduleName(String name);
}
