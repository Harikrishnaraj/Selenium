package Assingments.Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

    public static void main(String[] args) {
        

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Enter username and password
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click on the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click on the CRM link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click on the Leads link
        driver.findElement(By.linkText("Leads")).click();

        // Click on the Create Lead link
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter lead information
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Doe");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("John");
        driver.findElement(By.name("departmentName")).sendKeys("Sales");
        driver.findElement(By.name("description")).sendKeys("This is a test lead.");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("john.doe@example.com");

        // Select State/Province dropdown by visible text
        Select stateDropdown = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
        stateDropdown.selectByVisibleText("New York");

        // Click on the Create button
        driver.findElement(By.name("submitButton")).click();

        // Click on the Edit button
        driver.findElement(By.linkText("Edit")).click();

        // Clear the Description Field
        driver.findElement(By.name("description")).clear();

        // Fill ImportantNote Field with Any text
        driver.findElement(By.name("importantNote")).sendKeys("Updated important note.");

        // Click on the Update button
        driver.findElement(By.name("submitButton")).click();

        // Get the Title of Resulting Page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Close the browser
        driver.quit();
    }
}

