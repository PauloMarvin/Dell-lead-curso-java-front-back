package br.com.lead.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lead.modelo.Filme;

/**
 * Servlet implementation class OficinaJavaWebServlet
 */
@WebServlet("/oficina-filme")
public class OficinaJavaWebServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Filme coringa = new Filme("Coringa", "drama", 2019);
		Filme matrix = new Filme("Matrix", "acao", 1991);
		Filme forrestGump = new Filme("Forres Gump", "drama", 1994);

		ArrayList<Filme> todosFilmes = new ArrayList<Filme>();
		todosFilmes.add(coringa);
		todosFilmes.add(matrix);
		todosFilmes.add(forrestGump);

		String ano = req.getParameter("ano");

		resp.setContentType("text/HTML");

		PrintWriter out = resp.getWriter();

		out.println("<h2>Lista de Filmes, Por ano </h2>");

		out.println("<ol>");

		for (Filme filme : todosFilmes) {
			if (filme.getAno() >= Integer.valueOf(ano)) {
				out.println(String.format("<li> Nome: %s", filme.getNome()));
				out.println(String.format(" Genero: %s", filme.getGenero()));
				out.println(String.format(" Ano: %s </li>", filme.getAno()));
			}
			out.close();
		}

	}

}
