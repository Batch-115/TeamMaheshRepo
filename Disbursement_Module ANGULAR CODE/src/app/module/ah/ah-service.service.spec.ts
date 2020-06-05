import { TestBed } from '@angular/core/testing';

import { AhServiceService } from './ah-service.service';

describe('AhServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AhServiceService = TestBed.get(AhServiceService);
    expect(service).toBeTruthy();
  });
});
