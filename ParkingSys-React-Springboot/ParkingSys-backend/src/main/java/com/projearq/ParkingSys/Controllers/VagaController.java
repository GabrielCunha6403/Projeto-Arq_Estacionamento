package com.projearq.ParkingSys.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projearq.ParkingSys.Models.Cliente;
import com.projearq.ParkingSys.Models.Vaga;
import com.projearq.ParkingSys.Repositories.VagaRepository;

@RestController
public class VagaController {
	
	@Autowired
	private VagaRepository repository;

	@GetMapping
	@RequestMapping(value = "clientes/{id}/vaga")
	public Vaga findById(@PathVariable Long id){
		Vaga res = repository.findById(id).get();
		return res;
	}

	@PostMapping
	public Vaga insert(@RequestBody Vaga user){
		Vaga res = repository.save(user);
		return res;
	}

	@PostMapping
	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable Long id){
		Vaga vaga = repository.findById(id).get();
		repository.delete(vaga);
	}
}
