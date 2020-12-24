package br.com.lead.servlet;

import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lead.modelo.Filme;


@WebServlet("/persistir-filme")
public class PersisteFilmeServlet extends HttpServlet {
	
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String genero = req.getParameter("genero");
		Integer ano= Integer.valueOf(req.getParameter("ano"));
		
		
		Filme filme = new Filme(nome,genero , ano);
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("catalogodefilmes");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(filme);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
		
		
		
	}

}
