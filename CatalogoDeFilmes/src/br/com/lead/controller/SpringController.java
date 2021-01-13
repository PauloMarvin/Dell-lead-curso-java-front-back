package br.com.lead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
	@RequestMapping("adicionaFilme")
	@ResponseBody
	public String adicionaFilme(String nome, String genero, Integer ano) {
		String resposta = nome + " " + genero + " " + ano;
		return resposta;

	}
}
