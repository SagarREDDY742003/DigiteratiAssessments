import { Component } from '@angular/core';
import { Project } from '../model/project';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrl: './projects.component.css'
})
export class ProjectsComponent {
   projectlist:Project[]=[];
 
   constructor(private as:ApiService) {
     
   }

   ngOnInit(): void {
     this.as.getProjects().subscribe({
          next:(result:Project[])=>{this.projectlist=result},
          error:(err:any)=>{console.log(err)}
     })
  }
}
