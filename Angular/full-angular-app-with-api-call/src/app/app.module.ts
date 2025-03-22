import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuBarComponent } from './common/menu-bar/menu-bar.component';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { ContactComponent } from './pages/contact/contact.component';
import { ProjectsComponent } from './pages/projects/projects.component';
import { ContactItemComponent } from './pages/contact/contact-item/contact-item.component';
import { HttpClientModule } from '@angular/common/http';
import { ServiceItemComponent } from './pages/home/service-item/service-item.component';
import { ServiceDetailsComponent } from './pages/home/service-details/service-details.component';
import { EnquiryFormComponent } from './pages/home/enquiry-form/enquiry-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProjectItemComponent } from './pages/projects/project-item/project-item.component';
import { EnquiriesComponent } from './pages/enquiries/enquiries.component';
import { EnquiriesItemComponent } from './pages/enquiries/enquiries-item/enquiries-item.component';
import { LoginComponent } from './common/login/login.component';
import { EnquiryResponseComponent } from './pages/enquiries/enquiry-response/enquiry-response.component';
import { HighlightPipe } from './pipes/highlight.pipe';
import { FilterservicePipe } from './pipes/filterservice.pipe';


@NgModule({
  declarations: [
    AppComponent,
    MenuBarComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    ProjectsComponent,
    ContactItemComponent,
    ServiceItemComponent,
    ServiceDetailsComponent,
    EnquiryFormComponent,
    ProjectItemComponent,
    EnquiriesComponent,
    EnquiriesItemComponent,
    LoginComponent,
    EnquiryResponseComponent,
    HighlightPipe,
    FilterservicePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
