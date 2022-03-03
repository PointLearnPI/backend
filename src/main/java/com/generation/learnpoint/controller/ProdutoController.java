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

import com.generation.learnpoint.model.Produto;
import com.generation.learnpoint.repository.CategoriaRepository;
import com.generation.learnpoint.repository.ProdutoRepository;


@RestController
@RequestMapping ("/produto")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class ProdutoController {
	

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	@GetMapping ("/nome/{nomep}")
	public ResponseEntity<List<Produto>> findByNome(@PathVariable String nomep) {
		return ResponseEntity.ok(produtoRepository.findAllByNomepContainingIgnoreCase(nomep));
		}


		@GetMapping
		public ResponseEntity<List<Produto>> getAll() {
			return ResponseEntity.ok(produtoRepository.findAll());
			}


		@PostMapping
		public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
			return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
			}

	
		@PutMapping
		public ResponseEntity<Produto> putProduto(@Valid @RequestBody Produto produto) {
			if (produtoRepository.existsById(produto.getCategoria().getId()))
				return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));
			else
				return ResponseEntity.notFound().build();

		}
		

		@DeleteMapping("/{id}")
		public ResponseEntity<?> deleteProduto(@PathVariable Long id) {

			return produtoRepository.findById(id).map(resposta -> {
				produtoRepository.deleteById(id);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}).orElse(ResponseEntity.notFound().build());
		}
		
}

