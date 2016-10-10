package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RandomGiphy{
	
	@JsonProperty("type") public String type;
	@JsonProperty("id") public String id;
	@JsonProperty("url") public String url;
	@JsonProperty("image_original_url") public String imageOriginalUrl;
	@JsonProperty("image_url") public String imageUrl;
	@JsonProperty("image_mp4_url") public String imageMp4Url;
	@JsonProperty("image_frames") public String imageFrames;
	@JsonProperty("image_width") public String imageWidth;
	@JsonProperty("image_height") public String imageHeight;
	@JsonProperty("fixed_height_downsampled_url") public String fixedHeightDownsampledUrl;
	@JsonProperty("fixed_height_downsampled_width") public String fixedHeightDownsampledWidth;
	@JsonProperty("fixed_height_downsampled_height") public String fixedHeightDownsampledHeight;;
	@JsonProperty("fixed_width_downsampled_url") public String fixedWidthDownsampledUrl;
	@JsonProperty("fixed_width_downsampled_width") public String fixedWidthDownsampledWidth;
	@JsonProperty("fixed_width_downsampled_height") public String fixedWidthDownsampledHeight;
	@JsonProperty("fixed_height_small_url") public String fixedHeightSmallUrl;
	@JsonProperty("fixed_height_small_still_url") public String fixedHeightSmallStillUrl;
	@JsonProperty("fixed_height_small_width") public String fixedHeightSmallWidth;
	@JsonProperty("fixed_height_small_height") public String fixedHeightSmallHeight;
	@JsonProperty("fixed_width_small_url") public String fixedWidthSmallUrl;
	@JsonProperty("fixed_width_small_still_url") public String fixedWidthSmallStillUrl;
	@JsonProperty("fixed_width_small_width") public String fixedWidthSmallWidth;
	@JsonProperty("fixed_width_small_height") public String fixedWidthSmallHeight;
	@JsonProperty("username") public String username;
	@JsonProperty("caption") public String caption;
	
	public RandomGiphy(){}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImageOriginalUrl() {
		return imageOriginalUrl;
	}
	public void setImageOriginalUrl(String imageOriginalUrl) {
		this.imageOriginalUrl = imageOriginalUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageMp4Url() {
		return imageMp4Url;
	}
	public void setImageMp4Url(String imageMp4Url) {
		this.imageMp4Url = imageMp4Url;
	}
	public String getImageFrames() {
		return imageFrames;
	}
	public void setImageFrames(String imageFrames) {
		this.imageFrames = imageFrames;
	}
	public String getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(String imageWidth) {
		this.imageWidth = imageWidth;
	}
	public String getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(String imageHeight) {
		this.imageHeight = imageHeight;
	}
	public String getFixedHeightDownsampledUrl() {
		return fixedHeightDownsampledUrl;
	}
	public void setFixedHeightDownsampledUrl(String fixedHeightDownsampledUrl) {
		this.fixedHeightDownsampledUrl = fixedHeightDownsampledUrl;
	}
	public String getFixedHeightDownsampledWidth() {
		return fixedHeightDownsampledWidth;
	}
	public void setFixedHeightDownsampledWidth(String fixedHeightDownsampledWidth) {
		this.fixedHeightDownsampledWidth = fixedHeightDownsampledWidth;
	}
	public String getFixedHeightDownsampledHeight() {
		return fixedHeightDownsampledHeight;
	}
	public void setFixedHeightDownsampledHeight(String fixedHeightDownsampledHeight) {
		this.fixedHeightDownsampledHeight = fixedHeightDownsampledHeight;
	}
	public String getFixedWidthDownsampledUrl() {
		return fixedWidthDownsampledUrl;
	}
	public void setFixedWidthDownsampledUrl(String fixedWidthDownsampledUrl) {
		this.fixedWidthDownsampledUrl = fixedWidthDownsampledUrl;
	}
	public String getFixedWidthDownsampledWidth() {
		return fixedWidthDownsampledWidth;
	}
	public void setFixedWidthDownsampledWidth(String fixedWidthDownsampledWidth) {
		this.fixedWidthDownsampledWidth = fixedWidthDownsampledWidth;
	}
	public String getFixedWidthDownsampledHeight() {
		return fixedWidthDownsampledHeight;
	}
	public void setFixedWidthDownsampledHeight(String fixedWidthDownsampledHeight) {
		this.fixedWidthDownsampledHeight = fixedWidthDownsampledHeight;
	}
	public String getFixedHeightSmallUrl() {
		return fixedHeightSmallUrl;
	}
	public void setFixedHeightSmallUrl(String fixedHeightSmallUrl) {
		this.fixedHeightSmallUrl = fixedHeightSmallUrl;
	}
	public String getFixedHeightSmallStillUrl() {
		return fixedHeightSmallStillUrl;
	}
	public void setFixedHeightSmallStillUrl(String fixedHeightSmallStillUrl) {
		this.fixedHeightSmallStillUrl = fixedHeightSmallStillUrl;
	}
	public String getFixedHeightSmallWidth() {
		return fixedHeightSmallWidth;
	}
	public void setFixedHeightSmallWidth(String fixedHeightSmallWidth) {
		this.fixedHeightSmallWidth = fixedHeightSmallWidth;
	}
	public String getFixedHeightSmallHeight() {
		return fixedHeightSmallHeight;
	}
	public void setFixedHeightSmallHeight(String fixedHeightSmallHeight) {
		this.fixedHeightSmallHeight = fixedHeightSmallHeight;
	}
	public String getFixedWidthSmallUrl() {
		return fixedWidthSmallUrl;
	}
	public void setFixedWidthSmallUrl(String fixedWidthSmallUrl) {
		this.fixedWidthSmallUrl = fixedWidthSmallUrl;
	}
	public String getFixedWidthSmallStillUrl() {
		return fixedWidthSmallStillUrl;
	}
	public void setFixedWidthSmallStillUrl(String fixedWidthSmallStillUrl) {
		this.fixedWidthSmallStillUrl = fixedWidthSmallStillUrl;
	}
	public String getFixedWidthSmallWidth() {
		return fixedWidthSmallWidth;
	}
	public void setFixedWidthSmallWidth(String fixedWidthSmallWidth) {
		this.fixedWidthSmallWidth = fixedWidthSmallWidth;
	}
	public String getFixedWidthSmallHeight() {
		return fixedWidthSmallHeight;
	}
	public void setFixedWidthSmallHeight(String fixedWidthSmallHeight) {
		this.fixedWidthSmallHeight = fixedWidthSmallHeight;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
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
