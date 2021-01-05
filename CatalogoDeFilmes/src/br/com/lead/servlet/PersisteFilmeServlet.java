package br.com.lead.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;

import br.com.lead.modelo.Autor;
import br.com.lead.modelo.Filme;
import br.com.lead.util.JPAUtil;

@WebServlet("/persistir-filme")
public class PersisteFilmeServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String genero = req.getParameter("genero");
		Integer ano = Integer.valueOf(req.getParameter("ano"));
		
		String nomeAutor = req.getParameter("nomeAutor");
		LocalDate dataNascimentoAutor = LocalDate.parse(req.getParameter("dataNascimentoAutor"));
		
		
		Autor autor = new Autor();
		autor.setNome(nomeAutor);
		autor.setDataNascimento(dataNascimentoAutor);
		

		Filme filme = new Filme(nome, genero, ano);
		filme.setAutor(autor);

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();
		
		
		em.persist(autor);
		em.persist(filme);
		em.getTransaction().commit();

		em.close();

	}

}
