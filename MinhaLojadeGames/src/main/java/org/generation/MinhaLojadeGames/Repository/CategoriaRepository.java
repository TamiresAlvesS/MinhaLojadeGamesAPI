package org.generation.MinhaLojadeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.generation.MinhaLojadeGames.Repository.CategoriaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<org.generation.MinhaLojadeGames.Model.Categoria, Long> {
	public List<org.generation.MinhaLojadeGames.Model.Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}