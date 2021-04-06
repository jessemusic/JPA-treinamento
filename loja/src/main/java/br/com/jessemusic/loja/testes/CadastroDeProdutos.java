package br.com.jessemusic.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.jessemusic.loja.dao.CategoriaDao;
import br.com.jessemusic.loja.dao.ProdutoDao;
import br.com.jessemusic.loja.modelo.Categoria;
import br.com.jessemusic.loja.modelo.Produto;
import br.com.jessemusic.loja.util.JPAUtil;

public class CadastroDeProdutos {

	public static void main(String[] args) {
		cadastrarProduto();
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		
		Produto p = produtoDao.buscarPorId(1l);
		System.out.println(p.getPreco());
		
		List<Produto> todos = produtoDao.buscarTodos();
		todos.forEach(p2 -> System.out.println(p.getNome()));
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi","Muito legal",
				new BigDecimal("800"), celulares);
	
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
			
		em.getTransaction().begin();
		categoriaDao.Cadastrar(celulares);
		produtoDao.Cadastrar(celular);
		
		em.getTransaction().commit();
		em.close();
	}

}
