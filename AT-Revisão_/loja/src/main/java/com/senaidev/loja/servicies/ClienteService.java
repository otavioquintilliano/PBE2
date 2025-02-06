package com.senaidev.loja.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.loja.controllers.repositories.ClienteRepository;
import com.senaidev.loja.entities.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> buscarClientes() {
		return clienteRepository.findAll();
	}

	public Cliente buscarClientesPorId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public Cliente buscarClientePorCpf(String cpf) {
		return clienteRepository.findByCpf(cpf);
	}

	public Cliente criarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public void excluirCliente(Long id) {
		clienteRepository.deleteById(id);
		
	}

}
