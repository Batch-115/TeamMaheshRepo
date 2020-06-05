import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoanTransferComponent } from './loan-transfer.component';

describe('LoanTransferComponent', () => {
  let component: LoanTransferComponent;
  let fixture: ComponentFixture<LoanTransferComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoanTransferComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoanTransferComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
