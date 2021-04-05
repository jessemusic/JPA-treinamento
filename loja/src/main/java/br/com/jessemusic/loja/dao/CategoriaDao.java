package br.com.jessemusic.loja.dao;

import javax.persistence.EntityManager;

import br.com.jessemusic.loja.modelo.Categoria;

public class CategoriaDao {
	
	private EntityManager em;

	public CategoriaDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void Cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}

}
