Feature: Login test
  
 Background: 
	Given open "http://zero.webappsecurity.com/login.html" successfully
 
  Scenario: Validate login flow with valid credentials
     Then User enters username password and clicks signin button
     Then User lands on Account summary page
     And User logout successfully