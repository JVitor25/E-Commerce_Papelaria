package br.com.papelaria.papelariaAmorEmPapeis.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.papelariaAmorEmPapeis.model.Produto;
import br.com.papelaria.papelariaAmorEmPapeis.repository.ProdutoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	private ResponseEntity <List<Produto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	private ResponseEntity <Produto> post(@Valid @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping
	private ResponseEntity <Produto> put(@Valid @RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}
	
	@DeleteMapping("/{id}")
	private void deleteId(Long id) {
		repository.deleteById(id);
	}
}
