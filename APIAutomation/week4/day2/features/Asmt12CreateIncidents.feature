Feature: ServiceNow Incident Management
@inc1 
Scenario: Create Incident1

Given set the endpoint
And add the auth
And send the request
When post the request with short description as "This is First" and category as "software"
Then validate the response1 for below
|result.category|software|
 @inc2
Scenario: Create Incident2

Given set the endpoint
And add the auth
And send the request
When post the request with short description as "This is Second" and category as "hardware"
Then validate the response2 for below
|key|value|
|result.category|software|
|result.category|inquiry|

@inc3
Scenario: Create Incident3

Given set the endpoint
And add the auth
And send the request
When post the request with short description as "This is Third" and category as "inquiry"
Then validate the response3 for below
|result.short_description| |