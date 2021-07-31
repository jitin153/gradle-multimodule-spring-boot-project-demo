# gradle-multimodule-spring-boot-project
Gradle multimodule spring-boot demo project.

Run gradle :web-app:bootRun command inside root folder to run the project.

This demo app has only 2 rest endpoints.
 
1. http://localhost:8090/employee  --> RequestMethod: GET
2. http://localhost:8090/employee  --> RequestMethod: POST

Request body for the POST request:

{
    "name": "Any Name",
    "salary": 40000
}
