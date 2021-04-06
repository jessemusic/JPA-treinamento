package br.com.jessemusic.loja.dao;

import javax.persistence.EntityManager;

import org.h2.command.dml.Merge;

import br.com.jessemusic.loja.modelo.Categoria;
import br.com.jessemusic.loja.modelo.Produto;

public class CategoriaDao {
	
	private EntityManager em;
	
	public CategoriaDao() {
	}

	public CategoriaDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void Cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	
	public void atualizar(Categoria categoria) {
		this.em.merge(categoria);
	}
	
	public void remover(Categoria categoria) {
		categoria = em.merge(categoria);
		this.em.remove(categoria);
	}
	
	


}
