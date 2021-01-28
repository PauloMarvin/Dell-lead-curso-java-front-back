import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimeiroComponenteComponent } from './primeiro-componente.component';

describe('PrimeiroComponenteComponent', () => {
  let component: PrimeiroComponenteComponent;
  let fixture: ComponentFixture<PrimeiroComponenteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrimeiroComponenteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrimeiroComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
