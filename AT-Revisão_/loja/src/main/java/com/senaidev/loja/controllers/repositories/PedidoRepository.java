package com.senaidev.loja.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.loja.entities.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
