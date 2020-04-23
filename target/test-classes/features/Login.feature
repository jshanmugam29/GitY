Feature: Login into Application 

Scenario: Test Login with valid credentials 
	Given Open chrome and start application 
	And Navigate to site "http://leaftaps.com/opentaps/control/main"
	When I enter valid username as "DemoSalesManager"
	And I enter valid password as "crmsfa"
	Then user should be able to login successfully
	


