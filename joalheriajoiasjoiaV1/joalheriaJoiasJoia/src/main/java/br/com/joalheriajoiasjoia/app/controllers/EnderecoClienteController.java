package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.EnderecoCliente;
import br.com.joalheriajoiasjoia.app.services.EnderecoClienteService;

@RestController
@RequestMapping("/cadastroenderecocliente")
public class EnderecoClienteController {

	@Autowired
	private EnderecoClienteService enderecoclienteService;

	@PostMapping
	public EnderecoCliente createEnderecoCliente(@RequestBody EnderecoCliente enderecocliente) {
		return enderecoclienteService.saveEnderecoCliente(enderecocliente);
	}

	@GetMapping
	public List<EnderecoCliente> getAllEnderecoClientes() {
		return enderecoclienteService.getAllEnderecoClientes();
	}

	@GetMapping("/{id}")
	public EnderecoCliente getEnderecoCliente(@PathVariable Long id) {
		return enderecoclienteService.getEnderecoClienteById(id);
	}

	@PutMapping
	public EnderecoCliente editEnderecoCliente(@RequestBody EnderecoCliente enderecocliente) {
		return enderecoclienteService.saveEnderecoCliente(enderecocliente);
	}

	@DeleteMapping("/{id}")
	public void deleteEnderecoCliente(@PathVariable Long id) {
		enderecoclienteService.deleteEnderecoCliente(id);
	}

}
