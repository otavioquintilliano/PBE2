package com.senaidev.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senaidev.loja.entities.Cliente;
import com.senaidev.loja.servicies.ClienteService;

@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> buscarClientes(){
		return clienteService.buscarClientes();
	
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Object> buscarPedidosPorId(@PathVariable Long id){
		Cliente cliente = clienteService.buscarClientesPorId(id);
		
		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		}else {
			return ResponseEntity.status(404).body("Cliente com ID" + id +"não foi encontrado");
			
		}
	}
	@GetMapping("//{}")
	public Cliente buscarClientePorCpf(@PathVariable  Long id) {
		return clienteService.buscarClientesPorId(id);
	}
	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		return clienteService.criarCliente(cliente);
	}
	
	@DeleteMapping
	public void excluirClientes(@PathVariable Long id) {
		clienteService.excluirCliente(id);
		
	}

}
