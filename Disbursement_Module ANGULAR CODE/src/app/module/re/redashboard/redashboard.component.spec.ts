import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RedashboardComponent } from './redashboard.component';

describe('RedashboardComponent', () => {
  let component: RedashboardComponent;
  let fixture: ComponentFixture<RedashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RedashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RedashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
