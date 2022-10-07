package ekam.example.api.getAddress.model;

import java.util.List;

import lombok.Getter;

@Getter
public class GetAddressResponse{
	private int total;
	private int code;
	private List<DataItem> data;
	private String status;
}