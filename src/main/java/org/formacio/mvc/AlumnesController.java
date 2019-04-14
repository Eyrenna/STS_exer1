package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlumnesController {
	
	private ServeiAlumnat servei;
	
	@Autowired
	public void initServei(ServeiAlumnat servei) {
		this.servei = servei;
	}
	
	@RequestMapping(path="/alumnes")
	@ResponseBody
	public int numeroAlumnes() {
		return servei.getRepo().llistaAlumnes().size();
	}
	

}
