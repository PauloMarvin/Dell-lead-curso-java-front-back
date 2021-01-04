package br.com.lead.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lead.modelo.Filme;

@WebServlet("/filmeInfo")
public class FilmeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String genero = req.getParameter("genero");
		String ano = req.getParameter("ano");

		Filme infoFilmeFromUrl = new Filme(nome, genero, Integer.valueOf(ano));

		req.setAttribute("infoFilme", infoFilmeFromUrl);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/infofilme.jsp");

		dispatcher.forward(req, resp);
	}

}
