import Pages.P001_Register;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T001_Register extends Testbase{
    P001_Register register ;

    @Test
    public void registerWithRandomData() throws InterruptedException {
        String name = fake.name().fullName();
        String email = fake.internet().safeEmailAddress();
        String password = fake.internet().password(6,15,true , true, true );
        String firstname = fake.name().firstName();
        String lastname = fake.name().lastName();
        String company = fake.name().title();
        String address = fake.address().streetAddress();
        String state = fake.address().state();
        String zipCode = fake.address().zipCode();
        String mobile = fake.phoneNumber().phoneNumber();
    register = new P001_Register(driver);
    register.gotoRegisterPage();
    register.fillnameAndEmail(name, email);
    register.signUp();
    register.fillPassword(password);
    register.fillAddress(address);
    register.fillState(state);
    Thread.sleep(2000);
    register.fillZipCode(zipCode);
    register.fillMobile(mobile);
    register.choseRandomGender();
    register.chooseRandomDate();
    register.selectNewsletter();
    Thread.sleep(3000);
    register.fillFirstName(firstname);
    Thread.sleep(3000);
    register.fillLastName(lastname);
    register.fillCompany(company);
    register.chooseRandomCountry();
    Thread.sleep(3000);
    }
}
