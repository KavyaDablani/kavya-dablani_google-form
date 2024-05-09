package demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
    ChromeDriver driver;

    public TestCases() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void testCase01() throws InterruptedException {
        System.out.println("Start Test case: testCase01");

        // 1
        driver.get(
                "https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
        Thread.sleep(9000);
        // 2
        WebElement name = driver.findElement(By.xpath("(//input[@tabindex='0'])[1]"));
        name.click();
        name.sendKeys("Tester");
        Thread.sleep(5000);
        // 3
        long epochTime = System.currentTimeMillis();
        String message = "I want to be the best QA Engineer!" + epochTime;
        WebElement messageInput = driver.findElement(By.xpath("(//textarea[@class='KHxj8b tL9Q4c'])[1]"));
        messageInput.click();
        messageInput.sendKeys(message);
        Thread.sleep(5000);
        // 4 automate
        WebElement automationExp = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[4]"));
        automationExp.click();
        Thread.sleep(5000);
        // 5
        WebElement javaCheckbox = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]"));
        javaCheckbox.click();
        WebElement seleniumCheckbox = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]"));
        seleniumCheckbox.click();
        WebElement testngCheckbox = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[4]"));
        testngCheckbox.click();
        Thread.sleep(9000);
        // 6
        WebElement dropDown = driver.findElement(By.xpath("(//span[@class='vRMGwf oJeWuf'])[1]"));
        dropDown.click();
        Thread.sleep(4000);
        WebElement option = driver.findElement(By.xpath("(//span[@class='vRMGwf oJeWuf'])[8]"));
        option.click();
        Thread.sleep(8000);

        // 7
        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Subtract 7 days
        LocalDate sevenDaysAgo = currentDate.minusDays(7);

        // Format the date as required (MM/dd/yyyy)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String sevenDaysAgoString = sevenDaysAgo.format(formatter);

        // Fill the date field
        WebElement dateField = driver.findElement(By.xpath("//input[@type='date']"));

        dateField.sendKeys(sevenDaysAgoString);

        Thread.sleep(5000);

        // 8
        // Get current time
        LocalTime currentTime = LocalTime.now();

        // Format the time as required (hh:mm)
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm");
        String formattedTime = currentTime.format(formatter1);

        // Fill the time field
        WebElement timeField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        timeField.sendKeys(formattedTime);
        Thread.sleep(8000);
        WebElement timeField2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        timeField2.sendKeys(formattedTime);
        // Close the browser
        Thread.sleep(10000);

        // 9 their is not popup showing at the time of gradle run so I COMMENT THE CODE
        // driver.navigate().to("https://www.amazon.in");
        // Alert alert = driver.switchTo().alert();
        // alert.dismiss();
        // 10
        WebElement submit = driver.findElement(By.xpath("(//span[@class='NPEfkd RveJvd snByac'])[1]"));
        submit.click();

        // 11
        WebElement thanks = driver.findElement(By.xpath("//div[@class='vHW8K']"));
        String get = thanks.getText();
        System.out.println(get);

        System.out.println("end Test case: testCase01");
    }

}
