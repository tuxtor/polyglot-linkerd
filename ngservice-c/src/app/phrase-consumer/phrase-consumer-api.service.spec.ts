import { TestBed } from '@angular/core/testing';

import { PhraseConsumerApiService } from './phrase-consumer-api.service';

describe('PhraseConsumerApiService', () => {
  let service: PhraseConsumerApiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PhraseConsumerApiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
