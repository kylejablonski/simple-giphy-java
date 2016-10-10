package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SimpleGiphyResponse {

	@JsonProperty("data")
	private Giphy data;
	
	@JsonProperty("meta")
	private Meta meta;
	
	public SimpleGiphyResponse(){}

	public Giphy getData() {
		return data;
	}

	public void setGiphy(Giphy data) {
		this.data = data;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
}
