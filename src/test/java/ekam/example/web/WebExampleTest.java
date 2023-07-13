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
    @Issue("Issue-002")
    @Test(groups = "web", description = "Should navigate to Ekam documentation")
    public void shouldNavigateToEkamDocs() {

        // 1. Arrange
        String expectedTitle = "Getting started - Ekam";

        // 2. Act
        String title = Page(EkamStudioHomePage.class)
                .navigateToDocs()
                .getTitle();

        // 3. Assert
        assertEquals(title, expectedTitle, "Title is not matching");
    }
}
