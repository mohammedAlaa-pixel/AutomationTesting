package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P001_Register extends Base {
    public P001_Register (WebDriver driver) {
        super(driver); }// The Constructor
       private final By signupAndLoginButton = new By.ByCssSelector("a[href=\"/login\"]");// get the webLocator object
       private final By nameLocator = new By.ByCssSelector("input[name=\"name\"]");// get the webLocator object
       private final By emailAddressLocator = new By.ByCssSelector("input[data-qa=\"signup-email\"]"); // get the webLocator object
       private final By signUpLocator = new By.ByCssSelector("button[data-qa=\"signup-button\"]");
       private final By genderOptions = new By.ByCssSelector("div[class=\"radio-inline\"]");
       // get the webLocator object
       private final By daySelectLocator = new By.ByCssSelector("select[data-qa=\"days\"]");
       private final By dayOptionLocator = new By.ByCssSelector("select[data-qa=\"days\"] option  ");
       private final By monthSelectLocator = new By.ByCssSelector("select[data-qa=\"months\"]");
       private final By monthOptionLocator = new By.ByCssSelector("select[data-qa=\"months\"] option");
       private final By yearSelectLocator = new By.ByCssSelector("select[data-qa=\"years\"]");
       private final By yearOptionLocator = new By.ByCssSelector("select[data-qa=\"years\"] option ");
       private final By countrySelectLocator = new By.ByCssSelector("select[data-qa=\"country\"]");
       private final By countryOptionLocator = new By.ByCssSelector("select[data-qa=\"country\"] option");
       private final By passwordLocator = new By.ByCssSelector("input [data-qa=\"password\"]");
       private final By newsletterLocator = new By.ByCssSelector("input[name=\"newsletter\"]");
       private final By firstnameLocator = new By.ByCssSelector("input[data-qa=\"first_name\"]");
       private final By lastnameLocator = new By.ByCssSelector("input[data-qa=\"last_name\"]");
       private final By companyLocator = new By.ByCssSelector("input[data-qa=\"company\"]");
       private final By addressLocator = new By.ByCssSelector("input[data-qa=\"address\"]");
       private final By stateLocator = new By.ByCssSelector("input[data-qa=\"state\"]");
       private final By zipcodeLocator = new By.ByCssSelector("input[data-qa=\"zipcode\"]");
       private final By mobileLocator = new By.ByCssSelector("input[data-qa=\"mobile_number\"]");

       public void gotoRegisterPage(){
           click(signupAndLoginButton);
       }
       public void fillnameAndEmail(String name , String email){
           sendKeys(nameLocator,name );
           sendKeys(emailAddressLocator,email );

       }
       public void fillPassword(String password){
           sendKeys(passwordLocator,password);
       }
       public void signUp (){
           click(signUpLocator);
       }

       public void choseRandomGender(){
           int num = driver.findElements(genderOptions).size();
           // get the number of elements
           int random = fake.number().numberBetween(1,num+1);
           // number between function calculate between the first num to the last minus 1
           By gender  = By.xpath("//*[@class=\"radio-inline\"]["+random+"]//input");
           click(gender);
       }
       public void chooseRandomDate(){
           chooseRandomOption(daySelectLocator, dayOptionLocator, 2);
           chooseRandomOption(monthSelectLocator, monthOptionLocator, 2);
           chooseRandomOption(yearSelectLocator, yearOptionLocator, 2);
       }
       public void chooseRandomCountry(){
           chooseRandomOption(countrySelectLocator, countryOptionLocator, 1 );

       }
       public void selectNewsletter(){
           click(newsletterLocator);
       }
       public void fillFirstName(String firstName){
           sendKeys(firstnameLocator,firstName );
       }
       public void fillLastName(String lastName){
        sendKeys(lastnameLocator,lastName );
       }
       public void fillCompany(String company){
           sendKeys(companyLocator,company );
       }
       public void fillAddress(String address){
           sendKeys(addressLocator,address);
       }
       public void fillState(String state){
           sendKeys(stateLocator,state );
       }
       public void fillZipCode(String zipCode){
           sendKeys(zipcodeLocator,zipCode );
       }
       public void fillMobile(String mobile){
           sendKeys(mobileLocator,mobile);
       }



}
