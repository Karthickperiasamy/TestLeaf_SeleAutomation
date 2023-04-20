
Feature: ServiceNow Incident Management


#Scenario: Get all the incidents with multi query params
#
#
#Given add the queryParams as "sysparm_fields" and "sys_id, number, category"
#When send the request
#Then validate the response
#
#
#Scenario: Get all the incidents
#
#Given add the queryParams
#|sysparm_fields	|sys_id, number, category	|
#|category|software|
#When send the request
#Then validate the response

@create
Scenario: Create Incident

Given set the endpoint
And add the auth
And send the request
When post the request with short description as "This is New" and category as "software"
Then validate the response as 201
Then validate the response4 for below
|result.task_effective_number|10|

@update
Scenario: Update Incident

Given set the endpoint
And add the auth
And send the put request
#When post the request with short description as "This is New" and category as "software"
Then validate the response7 for below
|result.description||

@Get
Scenario: Pre-Get Incident

Given set the endpoint
And add the auth
#And add the queryParams
#|sysparm_fields|number,sys_id,short_description|
#|short_description|This is First|
And send the pre get request
#When post the request with short description as "This is New" and category as "software"
#Then validate the response



@Del
Scenario: Delete Incident

Given set the endpoint
And add the auth
And send the delete request
#When post the request with short description as "This is New" and category as "software"
Then validate the response as 204
#|result.description|1a23d4|

@Get2
Scenario: Post-Get Incident

Given set the endpoint
And add the auth
And send the post get request
Then validate the response as 404



@Create
Scenario: Create Incident

Given set the endpoint
And add the auth
And send the request
When post the request with short description as "This is New" and category as "software"
Then validate the response as 201
Then validate the response5 for below
|key|value|
|result.urgency|3|
|result.approval|not requested|
|result.knowledge|false|
Then validate the response6 for below
|key|value|
|result.number|INC|



