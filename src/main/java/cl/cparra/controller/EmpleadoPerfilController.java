package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actualizaEmpleado")
public class EmpleadoPerfilController {
	
	private static final Logger log = LoggerFactory.getLogger(EmpleadoPerfilController.class);

	@GetMapping
	public String actualizaEmpleado() {
		String actualizaEmpleado = "actualizaEmpleado";
		log.info("ok");
		return actualizaEmpleado;
	}
}