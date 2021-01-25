import { Component } from '@angular/core';
@Component({
    selector: 'filme',
    template: `
                <h2> Catálogo de Filmes </h2>
                <label> Filme: {{nomeFilme}} </label>
                <br/>
                <label> Publicação: {{anoPublicacao}}  </label>
     `
})
export class FilmeComponent {
} 