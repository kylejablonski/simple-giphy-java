package com.kdotj.simplegiphy.data;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class GiphyListResponse {
	
	@JsonProperty("data")
	private List<Giphy> data;
	
	@JsonProperty("meta")
	private Meta meta;

	
	public GiphyListResponse(){}


	public List<Giphy> getData() {
		return data;
	}


	public void setData(List<Giphy> data) {
		this.data = data;
	}


	public Meta getMeta() {
		return meta;
	}


	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	
	
}
