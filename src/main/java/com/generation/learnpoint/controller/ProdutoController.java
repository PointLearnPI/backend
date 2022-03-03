package com.generation.learnpoint.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ======================== PARTE 1 ========================
@RestController
@RequestMapping ("/produto")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
// ===================== PARTE 2 - DE ONDE VAI VIR AS INFOS ==================

	@Autowired
	private ProdutoRepository produtoRepository;
	
	// VER COMO ESTÁ NOMEADO A PRODUTOREPOSITORY, TEM QUE ESTAR IDENTICO
	
// =============== PARTE 3 - PESQUISA POR NOME DO CURSO ==============================
	
	@GetMapping ("/nome/{nomep}")
	public ResponseEntity<List<Produto>> findByNome(@PathVariable String {nomep) {
		return ResponseEntity.ok(produtoRepository.findAllByNomepContainingIgnoreCase({nomep));

	// todos os nomes tem que bater com a model e repository... se der erro tem que ajustar
	// a findAllByNomepContainingIgnoreCase pode estar errada, caso der erro me chama
	
// ========================== PARTE 4 - PESQUISAR EM TUDO ================================	
		@GetMapping
		public ResponseEntity<List<Produto>> getAll() {
			return ResponseEntity.ok(produtoRepository.findAll());

//========================== PARTE 5 - CRIANDO UM PRODUTO =======================
		@PostMapping
		public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
			return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
			}

// ================== PARTE 6 - ALTERAR UM PRODUTO =================================
	
		@PutMapping
		public ResponseEntity<Produto> putProduto(@Valid @RequestBody Produto produto) {
			if (categoriaRepository.existsById(produto.getCategoria().getId()))
				return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));
			else
				return ResponseEntity.notFound().build();

		}
		
// ============= PARTE 7 - DELETAR UM PRODUTO ===================================
		@DeleteMapping("/{id}")
		public ResponseEntity<?> deleteProduto(@PathVariable Long id) {

			return produtoRepository.findById(id).map(resposta -> {
				produtoRepository.deleteById(id);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}).orElse(ResponseEntity.notFound().build());
		}
		
		// SEMPRE LEMBRAR QUE TODAS AS NOMENCLATURAS DOS ATRIBUSTOS DEVEM ESTAR IDENTICOS AOS
		// NOMES DA REPOSITORY E MODEL, CASO CONTRARIO VAI DAR ERRO
}

