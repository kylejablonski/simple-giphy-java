package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomGiphyResponse {

	@JsonProperty("data")
	public RandomGiphy randomGiphy;
	
	@JsonProperty("meta")
	public Meta meta;
	
	public RandomGiphyResponse(){}

	public RandomGiphy getRandomGiphy() {
		return randomGiphy;
	}

	public void setData(RandomGiphy randomGiphy) {
		this.randomGiphy = randomGiphy;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
}
