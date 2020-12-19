package br.com.lead.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
		Filme coringa = new Filme("Coringa","drama" , 2019);
		Filme matrix = new Filme("Matrix","acao" , 1991);
		Filme forrestGump = new Filme("Forres Gump","drama" , 1994);
		
		ArrayList<Filme> todosFilmes = new ArrayList<Filme>();
		todosFilmes.add(coringa);
		todosFilmes.add(matrix);
		todosFilmes.add(forrestGump);
		
		String genero = req.getParameter("genero");
		String ano= req.getParameter("ano");
		String nome = req.getParameter("nome");
		
		resp.setContentType("text/HTML");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<h2>Lista de Filmes, utilizando servlet </h2>");
		
		out.println("<ol>");
		
		todosFilmes.stream().filter(filme -> filme.getGenero().toUpperCase().equals(genero.toUpperCase())).forEach(filme -> {
        	out.println(String.format("<li> Nome: %s", filme.getNome()));
        	out.println(String.format(" Genero: %s", filme.getGenero()));
        	out.println(String.format(" Ano: %s </li>", filme.getAno()));
        });
		
		
		
//		filmes.forEach(filme -> {
//			out.println(String.format("<li>Nome: %s", filme.getNome()));
//			out.println(String.format("Genero: %s", filme.getGenero()));
//			out.println(String.format("Genero: %s</li>", filme.getGenero()));
//			
//		});
		
		out.print("</ol>");
		out.close();
		
	
	}

	}
	
