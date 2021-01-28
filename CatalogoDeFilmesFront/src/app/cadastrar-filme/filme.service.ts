import { Filme } from './filme.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'


@Injectable()
export class FilmeService {

  httpClient: HttpClient;

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  cadastrarFilmes(filme: Filme) {
    return this.httpClient.post<Filme>('http://localhost:8080/CatalogoDeFilmes/persistir-filme', filme);
  }

  consultarFilmes(id:number) {
    return this.httpClient.get<Filme>('http://localhost:8080/CatalogoDeFilmes/consultar-filme?id=' + id );
  }

}