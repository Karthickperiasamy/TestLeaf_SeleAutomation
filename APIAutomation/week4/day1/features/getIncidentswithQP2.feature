Feature: ServiceNow Incident Management

Scenario: Get all the Incidents with Query Parameter

Given set the endpoint
And add the auth
And add the queryParams as "sysparm_fields" and "number"
When send the request with QP
Then validate the response