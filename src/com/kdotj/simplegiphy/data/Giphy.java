package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Object for a giphy from the Giphy API
 * @author kyle.jablonski
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Giphy {
	
	@JsonProperty("type") 
	private String type;
	
	@JsonProperty("id") 
	private String id;
	
	@JsonProperty("slug") 
	private String slug;
	
	@JsonProperty("url") 
	private String url;
	
	@JsonProperty("bitly_gif_url") 
	private String bitlyGifUrl;	
	
	@JsonProperty("bitly_url") 
	private String bitlyUrl;
	
	@JsonProperty("embed_url") 
	private String embedUrl;
	
	@JsonProperty("username") 
	private String username;
	
	@JsonProperty("source") 
	private String source;
	
	@JsonProperty("rating") 
	private String rating;
	
	@JsonProperty("caption") 
	private String caption;
	
	@JsonProperty("content_url") 
	private String contentUrl;
	
	@JsonProperty("source_tld") 
	private String sourceTld;
	
	@JsonProperty("source_post_url") 
	private String sourcePostUrl;
	
	@JsonProperty("import_datetime") 
	private String importDateTime;	
	
	@JsonProperty("trending_datetime") 
	private String trendingDateTime;
	
	@JsonProperty("images") 
	private Images images;
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bitlyGifUrl == null) ? 0 : bitlyGifUrl.hashCode());
		result = prime * result
				+ ((bitlyUrl == null) ? 0 : bitlyUrl.hashCode());
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result
				+ ((contentUrl == null) ? 0 : contentUrl.hashCode());
		result = prime * result
				+ ((embedUrl == null) ? 0 : embedUrl.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((images == null) ? 0 : images.hashCode());
		result = prime * result
				+ ((importDateTime == null) ? 0 : importDateTime.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((slug == null) ? 0 : slug.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result
				+ ((sourcePostUrl == null) ? 0 : sourcePostUrl.hashCode());
		result = prime * result
				+ ((sourceTld == null) ? 0 : sourceTld.hashCode());
		result = prime
				* result
				+ ((trendingDateTime == null) ? 0 : trendingDateTime.hashCode());
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
		Giphy other = (Giphy) obj;
		if (bitlyGifUrl == null) {
			if (other.bitlyGifUrl != null)
				return false;
		} else if (!bitlyGifUrl.equals(other.bitlyGifUrl))
			return false;
		if (bitlyUrl == null) {
			if (other.bitlyUrl != null)
				return false;
		} else if (!bitlyUrl.equals(other.bitlyUrl))
			return false;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (contentUrl == null) {
			if (other.contentUrl != null)
				return false;
		} else if (!contentUrl.equals(other.contentUrl))
			return false;
		if (embedUrl == null) {
			if (other.embedUrl != null)
				return false;
		} else if (!embedUrl.equals(other.embedUrl))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (images == null) {
			if (other.images != null)
				return false;
		} else if (!images.equals(other.images))
			return false;
		if (importDateTime == null) {
			if (other.importDateTime != null)
				return false;
		} else if (!importDateTime.equals(other.importDateTime))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (slug == null) {
			if (other.slug != null)
				return false;
		} else if (!slug.equals(other.slug))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (sourcePostUrl == null) {
			if (other.sourcePostUrl != null)
				return false;
		} else if (!sourcePostUrl.equals(other.sourcePostUrl))
			return false;
		if (sourceTld == null) {
			if (other.sourceTld != null)
				return false;
		} else if (!sourceTld.equals(other.sourceTld))
			return false;
		if (trendingDateTime == null) {
			if (other.trendingDateTime != null)
				return false;
		} else if (!trendingDateTime.equals(other.trendingDateTime))
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
