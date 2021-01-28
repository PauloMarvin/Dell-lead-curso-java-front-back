import { Component, OnInit } from '@angular/core';
import { Filme } from '../cadastrar-filme/filme.model';
import { FilmeService } from '../cadastrar-filme/filme.service';
@Component({
  selector: 'app-consultar-filme-component',
  templateUrl: './consultar-filme-component.component.html',
  styleUrls: ['./consultar-filme-component.component.css']
})
export class ConsultarFilmeComponentComponent implements OnInit {
  filmeDados : Filme;
  filmeService: FilmeService;

  constructor(filmeService: FilmeService) {
    this.filmeService = filmeService
  }

  ngOnInit(): void {
  }

  onSubmit(form) {

    let filme:Filme;
    filme = {
      id: form.value.id,
      nome: null,
      genero: null,
      ano: null,
      autor: {
        id: null,
        nome: null,
        dataNascimento: null
      }
    }

    this.filmeService.consultarFilmes(filme.id).subscribe( dados => {
      console.log("Pesquisando por filme do id: " + filme.id);
      console.log(dados);
      this.filmeDados = dados
      

    });

}}
