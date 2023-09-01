package Assingments.Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

    public static void main(String[] args) {
        

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open the URL
        driver.get("http://leaftaps.com/opentaps/control/main");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Enter username and password
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

        // Click on the Login button
        driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();

        // Click on the CRM link
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

        // Click on the Leads link
        driver.findElement(By.xpath("//a[text()='Leads']")).click();

        // Click on the Create Lead link
        driver.findElement(By.linkText("Create Lead")).click();

        // Fill in lead information
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

        // Select source dropdown by index
        Select sourceDropdown = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
        sourceDropdown.selectByIndex(1);

        // Select marketing campaign dropdown by value
        Select marketingDropdown = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
        marketingDropdown.selectByValue("CATRQ_CARNDRIVER");

        // Select industry dropdown by visible text
        Select industryDropdown = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
        industryDropdown.selectByVisibleText("Non-profit");

        // Click on the Create Lead button
        driver.findElement(By.name("submitButton")).click();

        // Get the Title of Resulting Page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Close the browser
        driver.quit();
    }
}


