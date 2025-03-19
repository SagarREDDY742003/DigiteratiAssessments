# Digiterati Assessments

Client                                               Server
 
  (receiver)     <----------------              -----------> (service provider)
                                                       (Web Service)
								(protocol)    -Http
								(medium of data exchange) - network
								(format for the data) - (many formats called http media types)

			API (applicaiton programmer interface )
			                                     (device,software, website,tool)
												  (television,database,twitter,fb,power bi)
				(developers) <-------(functions)
                                       (API)				

	---------------------------------------------------------------------------------
	REST API
	Representational state transfer

	client talks to server - REQUEST
	 to make request 
	    1. reach server
		2. reach the service
		3. reach the resource
		           URL :  http://servername(ip/dn):5566/api/employees
				Http REQUEST
				   Http Packets will transferred to server
				   Http header + http body
				   Http Header (key,value) -- configuration information
				   Http Body - represent state (data)
		A single resource on the server will have multiple behavior
		   1. you can read the resource - GET - NO Http body needed
		   2. you can create the resource - POST  - http body needed
		   3. delete the resource - DELETE -- Not Http body needed
		   4. replace/full update the resource -PUT  - http body needed
		   5. partially update the resource - PATCH  - http body needed
		   to specify what you want to do with the resource
		   you have to specify http verb/http method
		   GET
		   POST
		   PUT
		   PATCH
		   DELETE
		   addditionaly HEAD, OPTION, CONNECT, TRACE

		For a given Endpoint
		---------------------
		Server must have appropriate implementation
		if it has the implementation
		it will process accordingly and sends the response

		Server to client
		Http Response

		http headers (config)
		http body (REST DATA)
		Response status
		 status types:
		  1xx - informational messages
		  2xx  - success messages
		  3xx  - Redirectional messages
		  4xx   -  Client side error messages
		  5xx  - server side error messages


axios.get("http://localhost:4500/contacts")-------->Promise
 
 
  async function read() {
               const response = await  axios.get("http://localhost:4500/contacts")
              console.log(response.data)
  }
   result = axios.get("http://localhost:4500/contacts")
   result.then(
     (data)=> console.log(data),
	 (error)=>console.log(data)
   )
   angular 1.x(js)  was using promises to deal with api
   but promise? limitation 
   promise will give you data only once
   promises cannot be unsubscribed
   and also cannot deal complex scenarios effectively like nested activities,piped activies


   -----------------------------------------------------
   There is a library called RxjS which uses a types called Observable which
   handles asynchronous function calls more efficiently dealing complex scenariso
   Instead of promise angular uses observable

   an observable will subscribe and can receive data
   any number of times
   an observable can unsubscriped
   we can handle piped operations ,nested operation and other complex operations
   easily