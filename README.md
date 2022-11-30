# HomeLoan
Scenario

Our developers have finished coding a borrowing calculator and would like to make sure that the calculator continues to work as they make other changes to the page. They have asked you to build some automated tests covering various use cases to verify that the calculator is working properly. They intend to run these tests as part of every build.

They have asked you to use Cucumber, with UI test automation tool of your choice (e.g. Puppeteer, WebdriverIO, Selenium Webdriver, etc) and language of your choice selected between JavaScript or Java. The tests should run in a browser of your choice.

The current working production page is here: https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/

Exercise

The exercise is to create a Java/JavaScript project (or projects) in Eclipse/Intellij, add Cucumber and any other add-ins you might need.  

Develop the following three tests:
1.	A person with the following details: 
a.	Single, 
b.	0 dependants, 
c.	buying a home to live in, 
d.	with income of $80,000, 
e.	other income $10,000, 
f.	living expenses $500, 
g.	current home loan repayments $0,
h.	other loan repayments $100, 
i.	other commitments $0 
j.	and total credit card limits $10,000 
has a borrowing estimate of $479,000.
2.	Clicking the ‘start over’ button clears the form.
3.	Entering only $1 for Living expenses, and leaving all other fields as zero, clicking ‘Work out how much I could borrow’ returns the following message:
“Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641.”

To execute 
clone/import java file to IDE for required proj
run Calculator.java
