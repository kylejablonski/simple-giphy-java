
package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Random Giphy Response for the Giphy API which internally wraps {@link Meta} and {@link RandomGiphy}
 * @author Kyle Jablonski
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RandomGiphyResponse {

	@JsonProperty("data")
	private RandomGiphy randomGiphy;
	
	@JsonProperty("meta")
	private Meta meta;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meta == null) ? 0 : meta.hashCode());
		result = prime * result
				+ ((randomGiphy == null) ? 0 : randomGiphy.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RandomGiphyResponse other = (RandomGiphyResponse) obj;
		if (meta == null) {
			if (other.meta != null)
				return false;
		} else if (!meta.equals(other.meta))
			return false;
		if (randomGiphy == null) {
			if (other.randomGiphy != null)
				return false;
		} else if (!randomGiphy.equals(other.randomGiphy))
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
