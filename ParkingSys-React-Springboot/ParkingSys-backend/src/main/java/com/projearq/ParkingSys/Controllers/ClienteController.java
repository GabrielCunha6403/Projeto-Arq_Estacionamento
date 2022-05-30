package com.projearq.ParkingSys.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projearq.ParkingSys.Models.Cliente;
import com.projearq.ParkingSys.Repositories.ClienteRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@PostMapping
	public Cliente create(@RequestBody Cliente user){
		Cliente res = repository.save(user);
		return res;
	}

	@GetMapping
	public List<Cliente> findAll(){
		List <Cliente> res = repository.findAll();
		return res;
	}

	@GetMapping
	@RequestMapping(value = "/{id}")
	public Cliente findById(@PathVariable Long id){
		Cliente res = repository.findById(id).get();
		return res;
	}

	@PostMapping
	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable Long id){
		Cliente cliente = repository.findById(id).get();
		repository.delete(cliente);
	}
}
