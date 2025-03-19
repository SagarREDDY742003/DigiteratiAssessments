# FullAngularAppWithApiCall

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 17.3.13.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.

Routing

     http://localhost:4200/
	 http://localhost:4200/studio-------> /studio is resolved in server and if you 
	                               get new pages it is called server side routing
								   and the application becomes multipage
								   
								   /studio is resolved in browser itself without
								   loading new page but generating new content alone
								   client side routing
								   
				Client Side routing with angular
Top level or root level routes
----------------------------------

http://localhost:4200/about
http://localhost:4200/projects

here about and projects are top level routes

http://localhost:4200/projects/ai
http://localhost:4200/projects/budget

   here ai and budget are child routes of main route projects


### Services

 Service is an angular feature that usually contains some reusable functions
 that can be used across multiple components

 A Service are typescript classes which could be instantiated by using the concept of 
 dependency injection (constructor injection)

 By default services are singleton(only one object is created and the same object
 is injected everywhere)

 But if you want a new object everytime you can demand it by following some configuration 
```
 @Injectable()
 class DataService {



 }
```
 component
```
 @Component
 class DataComponent{

    constructor(private ds:DataService ){}  object will be injected

 }

suppose if you dont want singleton you want a fresh new object

@Component(
  provider: [DataService]

)

class DataComponent 
{

    constructor(private ds:DataService ){}  object will be injected (not singleton)

}

```

### Http API Calls

To make Http API calls angular supports a module called as HttpClientModule
in HttpClientModule we have a service called HttpClient using which 
we can call get GET,POST,PUT,DELETE and all other http methods

and all these methods returns Observable object (RxJS module)

What is Observable?

   Observable is an important object in RXjs that could be
   subsribed for asynchronous result from an function which
   deals with asynchronous logic


   result = http.get("http://localhost:4500/contacts")

   result is observable

   result.subscribe(
     {
        next: (data) => console.log(data),
        error: (error)=>console.log(error)
     }
   )
