import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { FilmeComponent } from './filmes/filme.component';
import { AutorComponent } from './autor/autor.component'; 
import { FilmeService } from './cadastrar-filme/filme.service';

import { CadastrarFilmeComponent } from './cadastrar-filme/cadastrar-filme.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
   declarations: [
   AppComponent,
   FilmeComponent,
   AutorComponent,
   CadastrarFilmeComponent,

   ],
   imports: [
   BrowserModule,
   HttpClientModule,

   ],
   providers: [FilmeService],
   bootstrap: [AppComponent]
 })
 export class AppModule { }