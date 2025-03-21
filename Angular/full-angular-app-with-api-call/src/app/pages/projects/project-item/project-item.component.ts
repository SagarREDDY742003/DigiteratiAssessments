import { Component, Input } from '@angular/core';
import { Project } from '../../model/project';

@Component({
  selector: 'app-project-item',
  templateUrl: './project-item.component.html',
  styleUrl: './project-item.component.css'
})
export class ProjectItemComponent {
  @Input() project: Project = {
      id: "",
      name: "",
      description: "",
      status: "",
      startDate: "",
      endDate: "",
      teamSize: "",
      image: "",
      category: ""
    }
}
