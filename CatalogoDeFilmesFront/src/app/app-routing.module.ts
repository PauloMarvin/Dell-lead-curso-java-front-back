import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PrimeiroComponenteComponent } from './primeiro-componente/primeiro-componente.component';
import { SegundoComponenteComponent } from './segundo-componente/segundo-componente.component';


const routes: Routes = [
  {path: "primeiro-componente", component: PrimeiroComponenteComponent },
  {path: "segundo-componente", component: SegundoComponenteComponent },
  {path: "**", component: PrimeiroComponenteComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
