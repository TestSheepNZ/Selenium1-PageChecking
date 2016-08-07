/*
 * The following is a copy of the script 1 code used as part of a blog tutorial
 * to teach Selenium basic.  This blog can be found here,
 * http://testsheepnz.blogspot.co.nz/2016/07/automation-18-gui-6-running-our-first.html
 * 
 * This code is customised from
 * http://www.seleniumhq.org/docs/03_webdriver.jsp#setting-up-a-selenium-webdriver-project
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

// The following declarations import required packages from the
// Selenium .jar libraries we included in our project
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageChecker {
	

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        // This copies all the information about the page we've loaded into
        // the page_item object
        WebDriver page_item = new FirefoxDriver();
       
        // Open our target page ... a previous blog article
        page_item.get("http://testsheepnz.blogspot.co.nz/2016/07/im-hoping-that-this-blog-will-have-most.html");
       
        // Print out the page title
        System.out.println("Page title is: " + page_item.getTitle());
       
        // Confirm if there is a blue aardvark in the page
        if ( page_item.getPageSource().contains("blue aardvark"))
        {
            System.out.println("Whole page contains blue aardvark");
        }

        // Confirm if there is a redaardvark in the page
        if ( page_item.getPageSource().contains("red aardvark"))
        {
            System.out.println("Whole page contains red aardvark");
        }       
       
        // We are now going to capture an element of the current page
        // I've used developer tools to find the ID for it
        // This is the main body of the piece (and excludes comments & title)
        WebElement element = page_item.findElement(By.id("post-body-8711143007795160191"));
       
        // Confirm if there is a blue aardvark in the element
        if ( element.getText().contains("blue aardvark"))
        {
            System.out.println("Original post element contains blue aardvark");
        }

        // Confirm if there is a red aardvark in the element
        if ( element.getText().contains("red aardvark") )
        {
            System.out.println("Original post element contains red aardvark");
        }               
    }

}