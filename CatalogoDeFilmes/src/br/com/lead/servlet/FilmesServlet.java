package br.com.lead.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lead.modelo.Filme;

@WebServlet("/filme")
public class FilmesServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Filme coringa = new Filme("Coringa","Drama" , 2019);
		Filme matrix = new Filme("Matrix","Ação" , 1991);
		Filme forrestGump = new Filme("Forres Gump","Drama" , 1994);
		
		ArrayList<Filme> todosFilmes = new ArrayList<Filme>();
		
		todosFilmes.add(coringa);
		todosFilmes.add(matrix);
		todosFilmes.add(forrestGump);
		
		String nome = req.getParameter("nome");
		String genero = req.getParameter("genero");
		String ano= req.getParameter("ano");
		
		PrintWriter out = resp.getWriter();
		
		
		
		ArrayList<Filme> filmesFiltrados = todosFilmes.stream().filter(filme -> filme.getGenero().toUpperCase().equals(genero.toUpperCase()))
				.collect(Collectors.toCollection(ArrayList::new));
		
		req.setAttribute("listaFiltrada", filmesFiltrados);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/lista-filmes.jsp");
		
		dispatcher.forward(req, resp);
		
//		todosFilmes.stream().filter(filme -> filme.getGenero().toUpperCase().equals(genero.toUpperCase())).forEach(filme -> {
//        	out.println(String.format("<li> Nome: %s", filme.getNome()));
//        	out.println(String.format(" Genero: %s", filme.getGenero()));
//        	out.println(String.format(" Ano: %s </li>", filme.getAno()));
//        });
		
		
		
//		filmes.forEach(filme -> {
//			out.println(String.format("<li>Nome: %s", filme.getNome()));
//			out.println(String.format("Genero: %s", filme.getGenero()));
//			out.println(String.format("Genero: %s</li>", filme.getGenero()));
//			
//		});
		
//		out.print("</ol>");
		out.close();
		
	
	}

	}
	
