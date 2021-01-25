import { Component } from '@angular/core';
@Component(
    {
        selector: 'autor',
        template: `
                <h2> Catálogo de Filmes Autor </h2>
                <label> Autor: {{nome}} </label>
                <br/>
                <label> Publicação: {{dataNascimento}}  </label>
        `
    }
)
export class AutorComponent {
    nome: String;
    dataNascimento : number; 

    constructor() {
        this.nome = 'Alfred Hitchcock';
        this.dataNascimento = 1899
    }
} 