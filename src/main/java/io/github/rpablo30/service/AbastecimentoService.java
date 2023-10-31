package io.github.rpablo30.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.github.rpablo30.entity.Abastecimento;
import io.github.rpablo30.repository.AbastecimentoRepository;

@Service
public class AbastecimentoService {

	private final AbastecimentoRepository abastecimentoRepository;

	@Autowired
	public AbastecimentoService(AbastecimentoRepository abastecimentoRepository) {
		this.abastecimentoRepository = abastecimentoRepository;
	}

	public Abastecimento salvarAbastecimentos(Abastecimento abastecimentos) {
		return abastecimentoRepository.save(abastecimentos);

	}

	public List<Abastecimento> findAll() {
		return abastecimentoRepository.findAll();
	}
}
