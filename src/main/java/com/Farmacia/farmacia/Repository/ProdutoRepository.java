package com.Farmacia.farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farmacia.farmacia.Model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByDescricaoTituloContainingIggnoreCase(String descricaoTitulo);

}
