package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author kyle.jablonski
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Giphy {
	
	@JsonProperty("type") private String type;
	@JsonProperty("id") private String id;
	@JsonProperty("slug") private String slug;
	@JsonProperty("url") private String url;
	@JsonProperty("bitly_gif_url") private String bitlyGifUrl;	
	@JsonProperty("bitly_url") private String bitlyUrl;
	@JsonProperty("embed_url") private String embedUrl;
	@JsonProperty("username") private String username;
	@JsonProperty("source") private String source;
	@JsonProperty("rating") private String rating;
	@JsonProperty("caption") private String caption;
	@JsonProperty("content_url") private String contentUrl;
	@JsonProperty("source_tld") private String sourceTld;
	@JsonProperty("source_post_url") private String sourcePostUrl;
	@JsonProperty("import_datetime") private String importDateTime;	
	@JsonProperty("trending_datetime") private String trendingDateTime;
	@JsonProperty("images") private Images images;
	
	public Giphy(){}
	
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

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBitlyGifUrl() {
		return bitlyGifUrl;
	}

	public void setBitlyGifUrl(String bitlyGifUrl) {
		this.bitlyGifUrl = bitlyGifUrl;
	}

	public String getBitlyUrl() {
		return bitlyUrl;
	}

	public void setBitlyUrl(String bitlyUrl) {
		this.bitlyUrl = bitlyUrl;
	}

	public String getEmbedUrl() {
		return embedUrl;
	}

	public void setEmbedUrl(String embedUrl) {
		this.embedUrl = embedUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getSourceTld() {
		return sourceTld;
	}

	public void setSourceTld(String sourceTld) {
		this.sourceTld = sourceTld;
	}

	public String getSourcePostUrl() {
		return sourcePostUrl;
	}

	public void setSourcePostUrl(String sourcePostUrl) {
		this.sourcePostUrl = sourcePostUrl;
	}

	public String getImportDateTime() {
		return importDateTime;
	}

	public void setImportDateTime(String importDateTime) {
		this.importDateTime = importDateTime;
	}

	public String getTrendingDateTime() {
		return trendingDateTime;
	}

	public void setTrendingDateTime(String trendingDateTime) {
		this.trendingDateTime = trendingDateTime;
	}
	
	public Images getImages() {
		return images;
	}

	public void setImages(Images images) {
		this.images = images;
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
