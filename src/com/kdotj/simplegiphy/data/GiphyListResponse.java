package com.kdotj.simplegiphy.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Wrapper object for a list of @{link Giphy} from the Giphy API
 * @author kyle.jablonski
 *
 */
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((meta == null) ? 0 : meta.hashCode());
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
		GiphyListResponse other = (GiphyListResponse) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (meta == null) {
			if (other.meta != null)
				return false;
		} else if (!meta.equals(other.meta))
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
