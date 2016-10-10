package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedImage {

	@JsonProperty("url")
	private String url;
	@JsonProperty("width")
	private String width;
	@JsonProperty("height")
	private String height;
	@JsonProperty("size")
	private String size;
	@JsonProperty("mp4")
	private String mp4;
	@JsonProperty("mp4_size")
	private String mp4Size;
	@JsonProperty("webp")
	private String webp;
	@JsonProperty("webp_size")
	private String webpSize;
	
	public FixedImage(){}

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

	public String getMp4() {
		return mp4;
	}

	public void setMp4(String mp4) {
		this.mp4 = mp4;
	}

	public String getMp4Size() {
		return mp4Size;
	}

	public void setMp4Size(String mp4Size) {
		this.mp4Size = mp4Size;
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
