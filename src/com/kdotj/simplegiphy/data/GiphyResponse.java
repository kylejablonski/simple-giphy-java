package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GiphyResponse {

	@JsonProperty("data")
	public Giphy data;
	
	@JsonProperty("meta")
	public Meta meta;
	
	public GiphyResponse(){}

	public Giphy getData() {
		return data;
	}

	public void setData(Giphy data) {
		this.data = data;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
}
