import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { FilmeComponent } from './filmes/filme.component';
import { AutorComponent } from './autor/autor.component'; 
import { FilmeService } from './cadastrar-filme/filme.service';

import { CadastrarFilmeComponent } from './cadastrar-filme/cadastrar-filme.component';
import { HttpClientModule } from '@angular/common/http';
import { ConsultarFilmeComponentComponent } from './consultar-filme-component/consultar-filme-component.component';
import { AppRoutingModule } from './app-routing.module';
import { PrimeiroComponenteComponent } from './primeiro-componente/primeiro-componente.component';
import { SegundoComponenteComponent } from './segundo-componente/segundo-componente.component';



@NgModule({
   declarations: [
   AppComponent,
   FilmeComponent,
   AutorComponent,
   CadastrarFilmeComponent,
   ConsultarFilmeComponentComponent,
   PrimeiroComponenteComponent,
   SegundoComponenteComponent

   ],
   imports: [
   BrowserModule,
   HttpClientModule,
   FormsModule,
   AppRoutingModule,

   ],
   providers: [FilmeService],
   bootstrap: [AppComponent]
 })
 export class AppModule { }