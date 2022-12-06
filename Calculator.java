import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
Public class Calculator{
Public static void main(WebElement[] args){
String url = “https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/”;
System.setProperty(“webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe”);

WebDriver driver = new ChromeDriver();
//Define X path
WebElement Applicationtype = driver.findElement(By.xpath(“//input[@id="application_type_single”]”);
WebElement number_of_dependants = driver.findElement (By.xpath(“//select[@title="Number of dependants"]”);
WebElement number_of_dependants_option = driver.findElement (By.xpath(“//select[@title="Number of dependants"]/option”);
WebElement property_type = driver.findElement (By.xpath(“//*[@id="borrow_type_home"]”);
WebElement your_earnings = driver.findElement (By.xpath(“//input[@aria-labelledby="q2q1"]”);
WebElement your_other_income = driver.findElement (By.xpath(“//input[@aria-labelledby="q2q2”]”);
WebElement living_expenses = driver.findElement (By.xpath(“//input[@aria-labelledby="q3q1”]”);
WebElement current_home_loan_repayments = driver.findElement (By.xpath(“//input[@aria-labelledby="q3q2"]”);
WebElement other_loan_repayments = driver.findElement (By.xpath(“//input[@aria-labelledby="q3q3”]”);
WebElement other_commitments = driver.findElement (By.xpath(“//input[@aria-labelledby="q3q4"]”);
WebElement total_credit_card_limits = driver.findElement (By.xpath(“//input[@aria-labelledby="q3q5"]”);
WebElement calculate_button = driver.findElement (By.xpath(“//button[contains(., 'Work out how much I could borrow')]”);
WebElement start_over_button = driver.findElement (By.xpath(“//button[@class="start-over"]”);
WebElement error_text = driver.findElement (By.xpath(“//span[@class="borrow__error__text"]”);

//Navigate to url and send values to the form

driver.navigate().to(url);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
your_earnings.sendKeys(“80000”);
your_other_income.sendKeys(“10000”);
living_expenses.sendKeys(“500”);
current_home_loan_repayments.sendKeys(“0”);
other_loan_repayments.sendKeys(“100”);
total_credit_card_limits.sendKeys(“10000”);
calculate_button.click();

//2.Clicking the start over button clears the form
start_over_button.click();

//3. Entering only $1 for Living expenses, and leaving all other fields as zero, clicking ‘Work out how much I could borrow’ returns the following message:
“Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641.”

living_expenses.sendKeys(“1”);
calculate_button.click();
String actualError= “Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641.”
if(actualError.equals(error_text)) {
    System.out.println("Test Case Passed");
}else{
    System.out.println("Test Case Failed");
};
