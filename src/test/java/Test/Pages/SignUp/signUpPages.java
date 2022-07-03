package Test.Pages.SignUp;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signUpPages extends PageObject {

    @FindBy(xpath = "//a[.='Daftar']")
    WebElement menuDaftar;

    public void clickMenuDaftar() {
        element(menuDaftar).waitUntilVisible();
        element(menuDaftar).click();
    }

    @FindBy(xpath = "//div[@class='AppHeader_card__3C4Pk justify-content-center background-primary']")
    WebElement daftarHeader;
    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(id = "mobilePhone")
    WebElement mobilePhoneField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "firstName")
    WebElement firstNameField;
    @FindBy(id = "lastName")
    WebElement lastNameField;
    @FindBy(id = "cityAndProvince")
    WebElement cityAndProvinceField;

    public void assertSingUpPages() {
        element(daftarHeader).waitUntilVisible();
        String actualMessage = element(daftarHeader).getText();
        Assert.assertEquals(actualMessage, "Daftar Akun");
        Assert.assertTrue(emailField.isDisplayed());
        Assert.assertTrue(mobilePhoneField.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(confirmPasswordField.isDisplayed());
        Assert.assertTrue(firstNameField.isDisplayed());
        Assert.assertTrue(lastNameField.isDisplayed());
        Assert.assertTrue(cityAndProvinceField.isDisplayed());
    }

    @FindBy(xpath = "//button[@class='btn_SGZcZ btn-track btn--action_kallT RegistrationForm_form-container__button__UolrR']")
    WebElement buttonDaftar;

    public void clickButtonDaftar() {
        element(buttonDaftar).waitUntilVisible();
        element(buttonDaftar).click();
    }

    @FindBy(xpath = "//div[@class='container_Eq-qi']/div[@class='m-t-4 error_rz3sn']")
    WebElement alertEmailField;
    @FindBy(xpath = "//div[@class='container_Eq-qi']/div[2]/div[@class='m-t-4 error_rz3sn']")
    WebElement alertNoHpField;
    @FindBy(xpath = "//div[@class='RegistrationForm_password-input-error-message__327xe']")
    WebElement alertPasswordField;
    @FindBy(xpath = "//p[@class='PasswordRequirement_input-note__2yLnZ']")
    WebElement noteNoHpField;
    @FindBy(xpath = "//div[@class='container_Eq-qi']/div[4]/div[@class='m-t-4 error_rz3sn']")
    WebElement alertConfirmPasswordField;
    @FindBy(xpath = "//div[@class='container_Eq-qi']/div[5]/div[@class='m-t-4 error_rz3sn']")
    WebElement alertFirstNameField;
    @FindBy(xpath = "//div[@class='container_Eq-qi']/div[6]/div[@class='m-t-4 error_rz3sn']")
    WebElement alertLastNameField;
    @FindBy(xpath = "//div[@class='container_Eq-qi']/div[7]/div[@class='m-t-4 error_rz3sn']")
    WebElement alertCityAndProvinceField;


    public void assertEmailAlert(String alertEmail) {
        element(alertEmailField).waitUntilVisible();
        String actualMessage = element(alertEmailField).getText();
        Assert.assertEquals(actualMessage, alertEmail);
    }

    public void assertMobilePhoneAlert(String alertMobilePhone) {
        element(alertNoHpField).waitUntilVisible();
        String actualMessage = element(alertNoHpField).getText();
        Assert.assertEquals(actualMessage, alertMobilePhone);
    }

    public void assertPasswordAlert(String alertPassword) {
        element(alertPasswordField).waitUntilVisible();
        String actualMessage = element(alertPasswordField).getText();
        Assert.assertEquals(actualMessage, alertPassword);
    }

    public void assertPasswordNote(String passwordNote) {
        element(noteNoHpField).waitUntilVisible();
        String actualMessage = element(noteNoHpField).getText();
        Assert.assertEquals(actualMessage, passwordNote);
    }

    public void assertConfirmPasswordAlert(String alertConfirmPassword) {
        element(alertConfirmPasswordField).waitUntilVisible();
        String actualMessage = element(alertConfirmPasswordField).getText();
        Assert.assertEquals(actualMessage, alertConfirmPassword);
    }

    public void assertFirstNameAlert(String alertFirstName) {
        element(alertFirstNameField).waitUntilVisible();
        String actualMessage = element(alertFirstNameField).getText();
        Assert.assertEquals(actualMessage, alertFirstName);
    }

    public void assertLastNameAlert(String alertLastName) {
        element(alertLastNameField).waitUntilVisible();
        String actualMessage = element(alertLastNameField).getText();
        Assert.assertEquals(actualMessage, alertLastName);
    }

    public void assertCityAndProvinceField(String alertCity) {
        element(alertCityAndProvinceField).waitUntilVisible();
        String actualMessage = element(alertCityAndProvinceField).getText();
        Assert.assertEquals(actualMessage, alertCity);
    }

    public void assertInvalidAlerts(String alertEmail, String alertMobilePhone, String alertPassword, String alertConfirmPassword, String alertFirstName, String alertLastName, String alertCity, String passwordNote) {
        assertEmailAlert(alertEmail);
        assertMobilePhoneAlert(alertMobilePhone);
        assertPasswordAlert(alertPassword);
        assertPasswordNote(passwordNote);
        assertConfirmPasswordAlert(alertConfirmPassword);
        assertFirstNameAlert(alertFirstName);
        assertLastNameAlert(alertLastName);
        assertCityAndProvinceField(alertCity);
    }

    public void inputEmail(String email){
        element(emailField).sendKeys(email);
    }

    public void inputMobilePhone(String mobilePhone){
        element(mobilePhoneField).sendKeys(mobilePhone);
    }

    public void inputPassword(String Password){
        element(passwordField).sendKeys(Password);
    }

    public void  inputConfirmPassword(String ConfirmPassword){
        element(confirmPasswordField).sendKeys(ConfirmPassword);
    }

    public void inputFirstName(String FirstName){
        element(firstNameField).sendKeys(FirstName);
    }

    public void inputLastName(String LastName){
        element(lastNameField).sendKeys(LastName);
    }

    @FindBy(xpath = "//div[@class='autocomplete__icon-right_hrISI']") WebElement searchIcon;
    public void inputCity(String City){
        element(cityAndProvinceField).sendKeys(City);
        element(searchIcon).click();
    }

    public void inputSingUpFields(String email, String mobilePhone, String Password, String ConfirmPassword, String FirstName, String LastName, String City){
        element(daftarHeader).waitUntilVisible();
        inputEmail(email);
        inputMobilePhone(mobilePhone);
        inputPassword(Password);
        inputConfirmPassword(ConfirmPassword);
        inputFirstName(FirstName);
        inputLastName(LastName);
        inputCity(City);
    }

    @FindBy(xpath = "//div[@class='container_Eq-qi']") WebElement otpPage;
    public void validateOTPPage(){
        element(otpPage).shouldBeVisible();
    }


}