package com.senaidev.loja.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.loja.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Cliente findByCpf(String cpf);
}
