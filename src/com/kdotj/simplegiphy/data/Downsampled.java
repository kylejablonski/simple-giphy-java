package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class Downsampled {

	@JsonProperty("url")
	private String url;
	@JsonProperty("width")
	private String width;
	@JsonProperty("height")
	private String height;
	@JsonProperty("size")
	private String size;
	@JsonProperty("webp")
	private String webp;
	@JsonProperty("webp_size")
	private String webpSize;
	
	public Downsampled(){}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWebp() {
		return webp;
	}

	public void setWebp(String webp) {
		this.webp = webp;
	}

	public String getWebpSize() {
		return webpSize;
	}

	public void setWebpSize(String webpSize) {
		this.webpSize = webpSize;
	}
	
	
}
