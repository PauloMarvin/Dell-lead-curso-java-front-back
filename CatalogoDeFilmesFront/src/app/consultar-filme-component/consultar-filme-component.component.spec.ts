import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultarFilmeComponentComponent } from './consultar-filme-component.component';

describe('ConsultarFilmeComponentComponent', () => {
  let component: ConsultarFilmeComponentComponent;
  let fixture: ComponentFixture<ConsultarFilmeComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsultarFilmeComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultarFilmeComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
