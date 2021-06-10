import { Component, OnInit } from '@angular/core';
import { PhraseConsumerApiService} from './phrase-consumer-api.service';

@Component({
  selector: 'app-phrase-consumer',
  templateUrl: './phrase-consumer.component.html',
  styleUrls: ['./phrase-consumer.component.css']
})
export class PhraseConsumerComponent implements OnInit {
  phrase = 'This is a phrase from backend';

  constructor(private phraseConsumerApiService: PhraseConsumerApiService) { }

  ngOnInit(): void {
    this.doPhraseRetrieval();
  }

  doPhraseRetrieval(): void{
    this.phraseConsumerApiService.getPhrase().subscribe((data) => {
      console.log(data);
      this.phrase = data;
    }, error => {
      console.log('General error from backend');
      this.phrase = 'General error from backend';
    });
  }

}
