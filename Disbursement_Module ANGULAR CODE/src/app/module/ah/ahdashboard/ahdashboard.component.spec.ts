import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AhdashboardComponent } from './ahdashboard.component';

describe('AhdashboardComponent', () => {
  let component: AhdashboardComponent;
  let fixture: ComponentFixture<AhdashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AhdashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AhdashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
