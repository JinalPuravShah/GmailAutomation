Feature: Gmail

Scenario: Successful Automation of Gmail
   Given User Launch Chrome Browser
   When User opens URL "https://mail.google.com/"
   And User enters Email as "jinal22011994@gmail.com" and click on Next
   And Password as "Jinal@12345678" and click on Login
   And click on Compose and click on To as "jinalnitinshah@gmail.com"
   And click on Subject and enter Subject as "Job Application for QA Role"
   And click on upload and upload pdf document  and click on Send
   And Click on Inbox
   And Click on AccountLogo and Click on Signout and close Browser
   