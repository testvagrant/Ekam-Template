package ekam.example.web;

import com.testvagrant.ekam.testBases.testng.WebTest;
import ekam.example.web.pages.EkamStudioHomePage;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import static com.testvagrant.ekam.commons.LayoutInitiator.Page;
import static org.testng.Assert.assertEquals;

@Test(groups = "web")
public class WebExampleTest extends WebTest {

    @TmsLink("TC-Web-001")
    @TmsLink("TC-Web-002")
    @Issue("Issue-002")
    @Test(groups = "web", description = "Should navigate to Ekam documentation")
    public void shouldNavigateToEkamDocs() {

        String title = Page(EkamStudioHomePage.class)
                .navigateToDocs()
                .getTitle();

        assertEquals(title, "Getting started - Ekam");

    }

}
