import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SegundoComponenteComponent } from './segundo-componente.component';

describe('SegundoComponenteComponent', () => {
  let component: SegundoComponenteComponent;
  let fixture: ComponentFixture<SegundoComponenteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SegundoComponenteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SegundoComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
