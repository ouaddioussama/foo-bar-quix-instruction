import { Component, OnInit } from '@angular/core';
import { ItemWithPath } from '../model/nav-item';
import { FOO_BAR_QUIX_NAVBAR ,FOO_BAR_QUIX_PATH } from '../constants/AppConstants';


@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html'
})
export class NavBarComponent implements OnInit {

  ngOnInit(): void {
  }

  navItems: ItemWithPath[] = [
    {text: 'Accueil', path: 'home'},
    {text: FOO_BAR_QUIX_NAVBAR, path: FOO_BAR_QUIX_PATH},
  ];

}
