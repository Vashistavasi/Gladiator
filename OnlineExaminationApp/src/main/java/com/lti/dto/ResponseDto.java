package com.lti.dto;

public class ResponseDto {
private String response;
private String response_id;

public String getResponse_id() {
	return response_id;
}

public void setResponse_id(String response_id) {
	this.response_id = response_id;
}

public String getResponse() {
	return response;
}

public void setResponse(String response) {
	this.response = response;
}

@Override
public String toString() {
	return "ResponseDto [response=" + response + "]";
}

}
