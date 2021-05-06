package org.generation.MinhaLojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.generation.MinhaLojadeGames.Repository.ProdutoRepository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoRepository, Long> {
	public List<ProdutoRepository> findAllByNomeContainingIgnoreCase(String nome);
}