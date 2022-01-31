import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentsComponent } from './students/students.component';
import { AuthComponent } from './auth/auth.component';
import { StudentViewComponent } from './student-view/student-view.component';
import {RouterModule} from "@angular/router";
import {SingleStudentComponent} from "./single-student/single-student.component";
import { FourOhFourComponent } from './four-oh-four/four-oh-four.component';




@NgModule({
  declarations: [
    AppComponent,
    StudentsComponent,
    AuthComponent,
    StudentViewComponent,
    SingleStudentComponent,
    FourOhFourComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }