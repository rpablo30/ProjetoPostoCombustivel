package io.github.rpablo30.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.github.rpablo30.entity.Abastecimento;
import io.github.rpablo30.service.AbastecimentoService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api")
public class AbastecimentoController {

	private final AbastecimentoService abastecimentoService;

	@Autowired
	public AbastecimentoController(AbastecimentoService abastecimentoService) {
		this.abastecimentoService = abastecimentoService;
	}

	@PostMapping("/abastecimento")
	public Abastecimento salvarAbastecimentos(@RequestBody Abastecimento abastecimentos) {
		return abastecimentoService.salvarAbastecimentos(abastecimentos);
	}

	@GetMapping("/listarAbastecimento")
	public ResponseEntity<List<Abastecimento>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(abastecimentoService.findAll());
	}
}
