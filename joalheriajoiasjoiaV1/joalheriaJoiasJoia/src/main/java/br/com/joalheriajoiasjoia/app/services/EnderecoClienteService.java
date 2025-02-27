package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.EnderecoCliente;
import br.com.joalheriajoiasjoia.app.repositories.EnderecoClienteRepository;

@Service
public class EnderecoClienteService {

	
	@Autowired
	
	private EnderecoClienteRepository enderecoclienterepository;
	
	public EnderecoCliente saveEnderecoCliente( EnderecoCliente enderecoCliente) {
		return enderecoclienterepository.save(enderecoCliente);
	}
		
	public void deleteEnderecoCliente(Long id) {
		enderecoclienterepository.deleteById(id);
	}

	public EnderecoCliente getEnderecoClienteById(Long id) {
		return enderecoclienterepository.findById(id).orElse(null);
	}

	public List<EnderecoCliente> getAllEnderecoClientes() {
		return enderecoclienterepository.findAll();
	}
}

