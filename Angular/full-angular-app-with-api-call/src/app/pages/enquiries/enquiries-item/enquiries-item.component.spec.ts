import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnquiriesItemComponent } from './enquiries-item.component';

describe('EnquiriesItemComponent', () => {
  let component: EnquiriesItemComponent;
  let fixture: ComponentFixture<EnquiriesItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EnquiriesItemComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EnquiriesItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
