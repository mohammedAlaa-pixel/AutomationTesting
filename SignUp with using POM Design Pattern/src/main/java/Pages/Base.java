package Pages;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Base {
    protected WebDriver driver;
    Faker fake = new Faker();

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this );
    } // Base Constructor
     // protected method to protect them for appearing in Test package
    protected void click(By by){
        driver.findElement(by).click(); // transform the webLocator By to web Element
    }
    protected  void click(WebElement element ){
        element.click();
    }
    protected void sendKeys(By by, String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
    protected  void sendKeys(WebElement element , String text){
        element.clear();
        element.sendKeys(text);
    }
    public void chooseRandomOption(By select , By option , int min  ){
        Select selection  = new Select(driver.findElement(select));
        int options = driver.findElements(option).size();
        int random = fake.number().numberBetween(min, options+1 );
        selection.selectByIndex(random);

    }
}
