package com.sanches.alertamed.api.resouce;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanches.alertamed.api.model.Pessoa;

@RestController
@RequestMapping("/teste")
public class TesteResource {
	
	@GetMapping
	public String mostrar() {
		return "teste";
	}
	
	@PostMapping
	public void salvar(@Valid @RequestBody Pessoa pessoa) {
		System.out.println("salvando");
	}
	
//	@PostMapping
//	public ResponseEntity<Paciente> salvar(@Valid @RequestBody Paciente paciente, HttpServletResponse response) {
//		Paciente pacienteSalvo = this.pacienteRepository.save(paciente);
//		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteSalvo);
//	}

}
