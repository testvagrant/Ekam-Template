package ekam.example.api.getAddress;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import ekam.example.api.getAddress.model.GetAddressResponse;
import io.qameta.allure.okhttp3.AllureOkHttp3;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class GetAddressClient extends RetrofitBaseClient {

    private interface GetAddressService {

        @GET("/api/v1/addresses")
        Call<GetAddressResponse> getAddress(
                @Query("_quantity") int quantity
        );
    }

    private final GetAddressService service;

    @Inject
    public GetAddressClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl, new AllureOkHttp3());
        service = httpClient.getService(GetAddressService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getAddress API")
    public GetAddressResponse getAddress(int quantity) {
        Call<GetAddressResponse> call = service.getAddress(quantity);
        Response<GetAddressResponse> response = httpClient.executeAsResponse(call);
        GetAddressResponse getAddressResponse = response.body();
        return getAddressResponse;
    }

}