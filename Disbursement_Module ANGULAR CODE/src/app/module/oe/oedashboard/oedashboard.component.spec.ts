import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OedashboardComponent } from './oedashboard.component';

describe('OedashboardComponent', () => {
  let component: OedashboardComponent;
  let fixture: ComponentFixture<OedashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OedashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OedashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
