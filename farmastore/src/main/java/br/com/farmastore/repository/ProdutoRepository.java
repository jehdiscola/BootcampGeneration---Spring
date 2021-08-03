package br.com.farmastore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.farmastore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	 public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

}
