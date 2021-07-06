package ekam.example.web;

import com.testvagrant.ekam.commons.annotations.WebStep;
import com.testvagrant.ekam.web.WebPage;
import org.openqa.selenium.By;

public class SearchPage extends WebPage {
    By name = queryByName("q");

    @WebStep(keyword = "Given", description = "I search with query")
    public void search(String query) {
        textbox(name).setText(query);
    }
}
