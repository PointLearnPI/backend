package com.generation.learnpoint.repository;

	
	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.generation.learnpoint.model.Produto;


	@Repository
	public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		
		public List <Produto> findAllByNomepContainingIgnoreCase(String nomep); 
		
		
		
	}



