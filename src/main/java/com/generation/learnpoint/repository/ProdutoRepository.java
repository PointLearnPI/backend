package com.generation.learnpoint.repository;

	import java.math.BigDecimal;
	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;


	@Repository
	public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		
		public List <Produto> findAllByDescricaocContainingIgnoreCase(String descricaoc); 
		
		
		
	}



