package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Giphy Object representation of a Random Giphy
 * @author kyle.jablonski
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RandomGiphy{
	
	@JsonProperty("type") 
	private String type;
	
	@JsonProperty("id") 
	private String id;
	
	@JsonProperty("url") 
	private String url;
	
	@JsonProperty("image_original_url") 
	private String imageOriginalUrl;
	
	@JsonProperty("image_url") 
	private String imageUrl;
	
	@JsonProperty("image_mp4_url") 
	private String imageMp4Url;
	
	@JsonProperty("image_frames") 
	private String imageFrames;
	
	@JsonProperty("image_width") 
	private String imageWidth;
	
	@JsonProperty("image_height") 
	private String imageHeight;
	
	@JsonProperty("fixed_height_downsampled_url") 
	private String fixedHeightDownsampledUrl;
	
	@JsonProperty("fixed_height_downsampled_width") 
	private String fixedHeightDownsampledWidth;
	
	@JsonProperty("fixed_height_downsampled_height") 
	private String fixedHeightDownsampledHeight;
	
	@JsonProperty("fixed_width_downsampled_url") 
	private String fixedWidthDownsampledUrl;
	
	@JsonProperty("fixed_width_downsampled_width") 
	private String fixedWidthDownsampledWidth;
	
	@JsonProperty("fixed_width_downsampled_height") 
	private String fixedWidthDownsampledHeight;
	
	@JsonProperty("fixed_height_small_url") 
	private String fixedHeightSmallUrl;
	
	@JsonProperty("fixed_height_small_still_url") 
	private String fixedHeightSmallStillUrl;
	
	@JsonProperty("fixed_height_small_width") 
	private String fixedHeightSmallWidth;
	
	@JsonProperty("fixed_height_small_height") 
	private String fixedHeightSmallHeight;
	
	@JsonProperty("fixed_width_small_url") 
	private String fixedWidthSmallUrl;
	
	@JsonProperty("fixed_width_small_still_url") 
	private String fixedWidthSmallStillUrl;
	
	@JsonProperty("fixed_width_small_width") 
	private String fixedWidthSmallWidth;
	
	@JsonProperty("fixed_width_small_height") 
	private String fixedWidthSmallHeight;
	
	@JsonProperty("username") 
	private String username;
	
	@JsonProperty("caption") 
	private String caption;
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime
				* result
				+ ((fixedHeightDownsampledHeight == null) ? 0
						: fixedHeightDownsampledHeight.hashCode());
		result = prime
				* result
				+ ((fixedHeightDownsampledUrl == null) ? 0
						: fixedHeightDownsampledUrl.hashCode());
		result = prime
				* result
				+ ((fixedHeightDownsampledWidth == null) ? 0
						: fixedHeightDownsampledWidth.hashCode());
		result = prime
				* result
				+ ((fixedHeightSmallHeight == null) ? 0
						: fixedHeightSmallHeight.hashCode());
		result = prime
				* result
				+ ((fixedHeightSmallStillUrl == null) ? 0
						: fixedHeightSmallStillUrl.hashCode());
		result = prime
				* result
				+ ((fixedHeightSmallUrl == null) ? 0 : fixedHeightSmallUrl
						.hashCode());
		result = prime
				* result
				+ ((fixedHeightSmallWidth == null) ? 0 : fixedHeightSmallWidth
						.hashCode());
		result = prime
				* result
				+ ((fixedWidthDownsampledHeight == null) ? 0
						: fixedWidthDownsampledHeight.hashCode());
		result = prime
				* result
				+ ((fixedWidthDownsampledUrl == null) ? 0
						: fixedWidthDownsampledUrl.hashCode());
		result = prime
				* result
				+ ((fixedWidthDownsampledWidth == null) ? 0
						: fixedWidthDownsampledWidth.hashCode());
		result = prime
				* result
				+ ((fixedWidthSmallHeight == null) ? 0 : fixedWidthSmallHeight
						.hashCode());
		result = prime
				* result
				+ ((fixedWidthSmallStillUrl == null) ? 0
						: fixedWidthSmallStillUrl.hashCode());
		result = prime
				* result
				+ ((fixedWidthSmallUrl == null) ? 0 : fixedWidthSmallUrl
						.hashCode());
		result = prime
				* result
				+ ((fixedWidthSmallWidth == null) ? 0 : fixedWidthSmallWidth
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((imageFrames == null) ? 0 : imageFrames.hashCode());
		result = prime * result
				+ ((imageHeight == null) ? 0 : imageHeight.hashCode());
		result = prime * result
				+ ((imageMp4Url == null) ? 0 : imageMp4Url.hashCode());
		result = prime
				* result
				+ ((imageOriginalUrl == null) ? 0 : imageOriginalUrl.hashCode());
		result = prime * result
				+ ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result
				+ ((imageWidth == null) ? 0 : imageWidth.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		RandomGiphy other = (RandomGiphy) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (fixedHeightDownsampledHeight == null) {
			if (other.fixedHeightDownsampledHeight != null)
				return false;
		} else if (!fixedHeightDownsampledHeight
				.equals(other.fixedHeightDownsampledHeight))
			return false;
		if (fixedHeightDownsampledUrl == null) {
			if (other.fixedHeightDownsampledUrl != null)
				return false;
		} else if (!fixedHeightDownsampledUrl
				.equals(other.fixedHeightDownsampledUrl))
			return false;
		if (fixedHeightDownsampledWidth == null) {
			if (other.fixedHeightDownsampledWidth != null)
				return false;
		} else if (!fixedHeightDownsampledWidth
				.equals(other.fixedHeightDownsampledWidth))
			return false;
		if (fixedHeightSmallHeight == null) {
			if (other.fixedHeightSmallHeight != null)
				return false;
		} else if (!fixedHeightSmallHeight.equals(other.fixedHeightSmallHeight))
			return false;
		if (fixedHeightSmallStillUrl == null) {
			if (other.fixedHeightSmallStillUrl != null)
				return false;
		} else if (!fixedHeightSmallStillUrl
				.equals(other.fixedHeightSmallStillUrl))
			return false;
		if (fixedHeightSmallUrl == null) {
			if (other.fixedHeightSmallUrl != null)
				return false;
		} else if (!fixedHeightSmallUrl.equals(other.fixedHeightSmallUrl))
			return false;
		if (fixedHeightSmallWidth == null) {
			if (other.fixedHeightSmallWidth != null)
				return false;
		} else if (!fixedHeightSmallWidth.equals(other.fixedHeightSmallWidth))
			return false;
		if (fixedWidthDownsampledHeight == null) {
			if (other.fixedWidthDownsampledHeight != null)
				return false;
		} else if (!fixedWidthDownsampledHeight
				.equals(other.fixedWidthDownsampledHeight))
			return false;
		if (fixedWidthDownsampledUrl == null) {
			if (other.fixedWidthDownsampledUrl != null)
				return false;
		} else if (!fixedWidthDownsampledUrl
				.equals(other.fixedWidthDownsampledUrl))
			return false;
		if (fixedWidthDownsampledWidth == null) {
			if (other.fixedWidthDownsampledWidth != null)
				return false;
		} else if (!fixedWidthDownsampledWidth
				.equals(other.fixedWidthDownsampledWidth))
			return false;
		if (fixedWidthSmallHeight == null) {
			if (other.fixedWidthSmallHeight != null)
				return false;
		} else if (!fixedWidthSmallHeight.equals(other.fixedWidthSmallHeight))
			return false;
		if (fixedWidthSmallStillUrl == null) {
			if (other.fixedWidthSmallStillUrl != null)
				return false;
		} else if (!fixedWidthSmallStillUrl
				.equals(other.fixedWidthSmallStillUrl))
			return false;
		if (fixedWidthSmallUrl == null) {
			if (other.fixedWidthSmallUrl != null)
				return false;
		} else if (!fixedWidthSmallUrl.equals(other.fixedWidthSmallUrl))
			return false;
		if (fixedWidthSmallWidth == null) {
			if (other.fixedWidthSmallWidth != null)
				return false;
		} else if (!fixedWidthSmallWidth.equals(other.fixedWidthSmallWidth))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageFrames == null) {
			if (other.imageFrames != null)
				return false;
		} else if (!imageFrames.equals(other.imageFrames))
			return false;
		if (imageHeight == null) {
			if (other.imageHeight != null)
				return false;
		} else if (!imageHeight.equals(other.imageHeight))
			return false;
		if (imageMp4Url == null) {
			if (other.imageMp4Url != null)
				return false;
		} else if (!imageMp4Url.equals(other.imageMp4Url))
			return false;
		if (imageOriginalUrl == null) {
			if (other.imageOriginalUrl != null)
				return false;
		} else if (!imageOriginalUrl.equals(other.imageOriginalUrl))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (imageWidth == null) {
			if (other.imageWidth != null)
				return false;
		} else if (!imageWidth.equals(other.imageWidth))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
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
