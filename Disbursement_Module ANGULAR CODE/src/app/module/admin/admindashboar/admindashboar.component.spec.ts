import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdmindashboarComponent } from './admindashboar.component';

describe('AdmindashboarComponent', () => {
  let component: AdmindashboarComponent;
  let fixture: ComponentFixture<AdmindashboarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdmindashboarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdmindashboarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
