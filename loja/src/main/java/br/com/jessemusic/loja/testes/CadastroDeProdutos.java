package br.com.jessemusic.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.jessemusic.loja.dao.ProdutoDao;
import br.com.jessemusic.loja.modelo.Categoria;
import br.com.jessemusic.loja.modelo.Produto;
import br.com.jessemusic.loja.util.JPAUtil;

public class CadastroDeProdutos {

	public static void main(String[] args) {


		Produto celular = new Produto("Xiaomi Redmi","Muito legal",
				new BigDecimal("800"),Categoria.CELULARES);
	
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);
			
		em.getTransaction().begin();
		dao.Cadastrar(celular);
		em.getTransaction().commit();
		em.close();

	}

}
