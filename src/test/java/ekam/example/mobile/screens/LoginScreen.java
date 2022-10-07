package ekam.example.mobile.screens;

import com.testvagrant.ekam.atoms.mobile.MobileScreen;
import com.testvagrant.ekam.reports.annotations.MobileStep;
import org.openqa.selenium.By;

public class LoginScreen extends MobileScreen {

    private final By usernameTextBox = queryByContentDesc("test-Username");
    private final By passwordTextBox = queryByContentDesc("test-Password");
    private final By loginButton = queryByContentDesc("test-LOGIN");
    private final By cart = queryByContentDesc("test-Cart");

    @MobileStep(keyword = "When", description = "I login")
    public LoginScreen login() {
        textbox(usernameTextBox).setText("standard_user");
        textbox(passwordTextBox).setText("secret_sauce");
        element(loginButton).click();
        return this;
    }

    @MobileStep(keyword = "Then", description = "Return if cart is displayed")
    public boolean isCartDisplayed() {
        return element(cart).isDisplayed();
    }
}
