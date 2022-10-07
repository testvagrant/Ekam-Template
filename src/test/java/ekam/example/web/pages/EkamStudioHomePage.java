package ekam.example.web.pages;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import org.openqa.selenium.By;

public class EkamStudioHomePage extends WebPage {

    private By docsLink = query("//li/a[contains(text(), 'Docs')]");

    @WebStep(keyword = "When", description = "I navigate to documentation page")
    public EkamStudioHomePage navigateToDocs() {

        element(docsLink).click();
        return this;
    }

    @WebStep(keyword = "Then", description = "I return title")
    public String getTitle() {

        return driver.getTitle();
    }


}