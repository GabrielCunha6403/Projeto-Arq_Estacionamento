package com.projearq.ParkingSys.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projearq.ParkingSys.Models.Veiculo;
import com.projearq.ParkingSys.Repositories.VeiculoRepository;

@RestController
@RequestMapping(value = "/clientes/{id}/veiculo")
public class VeiculoController extends Veiculo{
	
	@Autowired
	private VeiculoRepository repository;

	@PostMapping
	public Veiculo create(@RequestBody Veiculo user){
		Veiculo res = repository.save(user);
		return res;
	}

	@GetMapping
	public Veiculo findById(@PathVariable Long id){
		Veiculo res = repository.findById(id).get();
		return res;
	}

	@PostMapping
	@RequestMapping(value = "/delete")
	public void delete(@PathVariable Long id){
		Veiculo cliente = repository.findById(id).get();
		repository.delete(cliente);
	}
	
}
