package br.com.jessemusic.loja.dao;

import javax.persistence.EntityManager;

import br.com.jessemusic.loja.modelo.Produto;

public class ProdutoDao {
	
	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void Cadastrar(Produto produto) {
		this.em.persist(produto);
	}

}
