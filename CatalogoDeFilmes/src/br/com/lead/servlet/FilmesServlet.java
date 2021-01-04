package br.com.lead.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lead.modelo.Filme;
import br.com.lead.util.JPAUtil;

@WebServlet("/filme")
public class FilmesServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction();

		Filme filme = em.find(Filme.class, 1);

		em.close();

		ArrayList<Filme> listaFiltrada = new ArrayList<Filme>();
		listaFiltrada.add(filme);

		req.setAttribute("listaFiltrada", listaFiltrada);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/lista-filmes.jsp");
		dispatcher.forward(req, resp);



	}

}
