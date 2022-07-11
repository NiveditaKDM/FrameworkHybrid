package com.Narcissus.pages;

import com.keyworddriven.Keyword;
import com.utils.Waits;

import java.time.Duration;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPagec {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://ijmeet.com/about_us?csrt=2941680764464174167']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(id = "company_name")
    @CacheLookup
    private WebElement companyName;
    @FindBy(css="label#name-error-server")
    private WebElement fullNameErr;

    @FindBy(css = "#contact a.nav-link.font-weight-bold")
    @CacheLookup
    private WebElement contactSales;

    @FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(2) ul.list-unstyled.text-small li:nth-of-type(2) a.text-muted")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement emailId;

    @FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(2) a.text-muted")
    @CacheLookup
    private WebElement facebook;

    @FindBy(id = "name")
    @CacheLookup
    private WebElement fullName;

    @FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(3) a.text-muted")
    @CacheLookup
    private WebElement google;

    @FindBy(css = "a[href='https://ijmeet.com/host_meeting?csrt=2941680764464174167']")
    @CacheLookup
    private WebElement hostMeeting;

    @FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(4) a.text-muted")
    @CacheLookup
    private WebElement instagram;

    @FindBy(css = "a[href='https://ijmeet.com/app?csrt=2941680764464174167']")
    @CacheLookup
    private WebElement joinMeeting;

    @FindBy(css = "-wrapper.full-page-wrapper div.content-wrapper.d-flex.align-items-stretch.auth.auth-img-bg div.row.flex-grow div.col-xs-12.col-sm-12.col-lg-7.m-auto.d-flex.align-items-center.justify-content-center div.auth-form-transparent.text-left.px-3 form.pt-3.common-inventory-border div:nth-of-type(3) label.form-check-label-dont-have.mb-0 a")
    @CacheLookup
    private WebElement logIn;

    @FindBy(id = "contact")
    @CacheLookup
    private WebElement mobileNumber;

    @FindBy(id = "g-recaptcha-response")
    @CacheLookup
    private WebElement mobileNumberPasswordThisFieldIs;

    private final String pageLoadedText = "United security Building, 3rd floor";

    private final String pageUrl = "/register?csrt=2941680764464174167";

    @FindBy(css = "a[href='https://ijmeet.com/privacy?csrt=2941680764464174167']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a.nav-link.nav-right-cutom-bg.font-weight-bold")
    @CacheLookup
    private WebElement signIn;

    @FindBy(css = "a.social-login-button.social-login-button-facebook")
    @CacheLookup
    private WebElement signInWithFacebook;

    @FindBy(css = "a.social-login-button.social-login-button-sso")
    @CacheLookup
    private WebElement signInWithFederation;

    @FindBy(css = "a.social-login-button.social-login-button-google")
    @CacheLookup
    private WebElement signInWithGoogle;

    @FindBy(css = "a.nav-link.nav-right-cutom-bg-1.font-weight-bold")
    @CacheLookup
    private WebElement signUp1;

    @FindBy(css = "button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.mirror-view-btn-primary")
    @CacheLookup
    private WebElement signUp2;

    @FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(2) ul.list-unstyled.text-small li:nth-of-type(1) a.text-muted")
    @CacheLookup
    private WebElement support;

    @FindBy(css = "a[href='https://ijmeet.com/terms_conditions?csrt=2941680764464174167']")
    @CacheLookup
    private WebElement termsConditions;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement thisFieldIsRequired;

    @FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(4) ul.list-unstyled.text-small li:nth-of-type(1) a.text-muted")
    @CacheLookup
    private WebElement twitter;

    public SignUpPagec() {
    	PageFactory.initElements(Keyword.driver, this);
    }

    

    /**
     * Click on About Us Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Contact Sales Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickContactSalesLink() {
        contactSales.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickGoogleLink() {
        google.click();
        return this;
    }

    /**
     * Click on Host Meeting Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickHostMeetingLink() {
        hostMeeting.click();
        return this;
    }

    /**
     * Click on Instagram Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickInstagramLink() {
        instagram.click();
        return this;
    }

    /**
     * Click on Join Meeting Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickJoinMeetingLink() {
        joinMeeting.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickLogInLink() {
        logIn.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Sign In Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickSignInLink() {
        signIn.click();
        return this;
    }

    /**
     * Click on Sign In With Facebook Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickSignInWithFacebookLink() {
        signInWithFacebook.click();
        return this;
    }

    /**
     * Click on Sign In With Federation Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickSignInWithFederationLink() {
        signInWithFederation.click();
        return this;
    }

    /**
     * Click on Sign In With Google Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickSignInWithGoogleLink() {
        signInWithGoogle.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickSignUp1Button() {
        signUp1.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickSignUp2Button() {
       // signUp2.click();
    	Waits wait=new Waits();
    	wait.forDuration(4);
    	//Keyword.driver.executeAsyncScript();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickSupportLink() {
        support.click();
        return this;
    }

    /**
     * Click on Terms Conditions Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec fill() {
        setFullNameTextField();
        setCompanyNameTextField();
        setEmailIdEmailField();
        setMobileNumberTextField();
        setThisFieldIsRequiredPasswordField();
        setMobileNumberPasswordThisFieldIsTextareaField();
        return this;
    }

   

    /**
     * Set default value to Company Name Text field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setCompanyNameTextField() {
        return setCompanyNameTextField(data.get("COMPANY_NAME"));
    }

    /**
     * Set value to Company Name Text field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setCompanyNameTextField(String companyNameValue) {
        companyName.sendKeys(companyNameValue);
        return this;
    }

    /**
     * Set default value to Email Id Email field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setEmailIdEmailField() {
        return setEmailIdEmailField(data.get("EMAIL_ID"));
    }

    /**
     * Set value to Email Id Email field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setEmailIdEmailField(String emailIdValue) {
        emailId.sendKeys(emailIdValue);
        return this;
    }

    /**
     * Set default value to Full Name Text field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setFullNameTextField() {
        return setFullNameTextField(data.get("FULL_NAME"));
    }

    /**
     * Set value to Full Name Text field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setFullNameTextField(String fullNameValue) {
        fullName.sendKeys(fullNameValue);
        return this;
    }

    /**
     * Set default value to Mobile Number Password This Field Is Required Textarea field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setMobileNumberPasswordThisFieldIsTextareaField() {
        return setMobileNumberPasswordThisFieldIsTextareaField(data.get("MOBILE_NUMBER_PASSWORD_THIS_FIELD_IS"));
    }

    /**
     * Set value to Mobile Number Password This Field Is Required Textarea field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setMobileNumberPasswordThisFieldIsTextareaField(String mobileNumberPasswordThisFieldIsValue) {
        mobileNumberPasswordThisFieldIs.sendKeys(mobileNumberPasswordThisFieldIsValue);
        return this;
    }

    /**
     * Set default value to Mobile Number Text field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setMobileNumberTextField() {
        return setMobileNumberTextField(data.get("MOBILE_NUMBER"));
    }

    /**
     * Set value to Mobile Number Text field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setMobileNumberTextField(String mobileNumberValue) {
        mobileNumber.sendKeys(mobileNumberValue);
        return this;
    }

    /**
     * Set default value to This Field Is Required. Password field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setThisFieldIsRequiredPasswordField() {
        return setThisFieldIsRequiredPasswordField(data.get("THIS_FIELD_IS_REQUIRED"));
    }

    /**
     * Set value to This Field Is Required. Password field.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec setThisFieldIsRequiredPasswordField(String thisFieldIsRequiredValue) {
        thisFieldIsRequired.sendKeys(thisFieldIsRequiredValue);
        return this;
    }



    /**
     * Verify that the page loaded completely.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec verifyPageLoaded() {
        (new WebDriverWait(driver,Duration.ofSeconds(timeout))).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the SignUpPagec class instance.
     */
    public SignUpPagec verifyPageUrl() {
        (new WebDriverWait(driver, Duration.ofSeconds(timeout))).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }

public  String getFullNameErrMsg() {
	return fullNameErr.getText();
	

}





	
}
