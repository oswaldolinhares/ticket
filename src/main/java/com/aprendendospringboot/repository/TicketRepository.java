package com.aprendendospringboot.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aprendendospringboot.domain.Ticket;

// Anotação que marca a classe como um repositório ela faz mediação entre a classe domínio
// e a camada de mapeamento de dados, é passado um objeto para pesquisa e o banco é 
// consultado e retorna uma lista de objetos semelhantes ao objeto passado
@Repository							    	//<objeto a ser passado e id>
public interface TicketRepository extends JpaRepository<Ticket, Integer>{ 
	List<Ticket> findByPriority(int priority);
	
	List<Ticket> findByCreation(Date creation);
	
	List<Ticket> findByCreationAndPriority(Date creation, int priority);
	
	

}
