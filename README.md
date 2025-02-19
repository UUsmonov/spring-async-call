## Description

Spring boot service, which gathers data from two endpoints asynchronously, merges the responses and displays them from an REST API.

- https://jsonplaceholder.typicode.com/users/{userId}
- https://jsonplaceholder.typicode.com/posts?userId={userId}


#### Using the Service

Once the Service is running, it exposes the `/api/users/v1/{userId}` Endpoint on Port 9191. Where the userId is an Integer
value representing the userId of the user for which the user information should get retrieved. 
There are two request as postman-collection included. It could be also request with following shell command. 

   ```shell 
   curl  http://localhost:9191/api/users/v1/1
   ```