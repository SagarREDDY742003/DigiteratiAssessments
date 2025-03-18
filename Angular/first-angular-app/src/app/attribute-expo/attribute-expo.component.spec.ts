import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributeExpoComponent } from './attribute-expo.component';

describe('AttributeExpoComponent', () => {
  let component: AttributeExpoComponent;
  let fixture: ComponentFixture<AttributeExpoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AttributeExpoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AttributeExpoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
