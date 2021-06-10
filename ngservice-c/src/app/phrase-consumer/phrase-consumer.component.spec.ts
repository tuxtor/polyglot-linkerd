import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PhraseConsumerComponent } from './phrase-consumer.component';

describe('PhraseConsumerComponent', () => {
  let component: PhraseConsumerComponent;
  let fixture: ComponentFixture<PhraseConsumerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PhraseConsumerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PhraseConsumerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
