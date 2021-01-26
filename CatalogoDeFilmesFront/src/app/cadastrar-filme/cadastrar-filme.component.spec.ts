import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarFilmeComponent } from './cadastrar-filme.component';

describe('CadastrarFilmeComponent', () => {
  let component: CadastrarFilmeComponent;
  let fixture: ComponentFixture<CadastrarFilmeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarFilmeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarFilmeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
