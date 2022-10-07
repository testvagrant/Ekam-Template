package ekam.example.api;

import com.testvagrant.ekam.testBases.testng.APITest;
import ekam.example.api.getAddress.GetAddressClient;
import ekam.example.api.getAddress.model.GetAddressResponse;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import io.qameta.allure.TmsLinks;
import org.testng.annotations.Test;

import static com.testvagrant.ekam.commons.LayoutInitiator.Client;
import static org.testng.Assert.assertEquals;

public class ApiExampleTest extends APITest {

    @TmsLinks({@TmsLink("TC-API-001"), @TmsLink("TC-API-2")})
    @Issue("Issue-001")
    @Test(groups = "api", description = "Should get address by query parameter")
    public void shouldGetAddressSuccessfully() {

        // 1. Arrange
        int addressId = 1;

        // 2. Act
        GetAddressResponse response =
                Client(GetAddressClient.class).getAddress(addressId);

        // 3. Assert
        assertEquals(response.getStatus(), "OK");
        assertEquals(response.getCode(), 200);
        assertEquals(response.getData().get(0).getId(), addressId);

    }
}