import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PreoderComponent } from './preoder.component';

describe('PreoderComponent', () => {
  let component: PreoderComponent;
  let fixture: ComponentFixture<PreoderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PreoderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PreoderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
