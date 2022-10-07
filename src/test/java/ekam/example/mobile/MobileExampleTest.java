package ekam.example.mobile;

import com.testvagrant.ekam.testBases.testng.MobileTest;
import static com.testvagrant.ekam.commons.LayoutInitiator.*;
import ekam.example.mobile.screens.LoginScreen;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = "mobile")
public class MobileExampleTest extends MobileTest {

    public void shouldLoginSuccessfully() {

        boolean cartDisplayed = Screen(LoginScreen.class)
                .login()
                .isCartDisplayed();
        assertTrue(cartDisplayed, "Cart is not displayed");
    }
}
