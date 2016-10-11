/*
	Licensed to the Apache Software Foundation (ASF) under one
	or more contributor license agreements.  See the NOTICE file
	distributed with this work for additional information
	regarding copyright ownership.  The ASF licenses this file
	to you under the Apache License, Version 2.0 (the
	"License"); you may not use this file except in compliance
	with the License.  You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
	KIND, either express or implied.  See the License for the
	specific language governing permissions and limitations
	under the License.
 */
package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Object for the Original Giphy from the Giphy API
 * @author Kyle Jablonski
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Original {
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("width")
	private String width;
	
	@JsonProperty("height")
	private String height;
	
	@JsonProperty("size")
	private String size;
	
	@JsonProperty("frames")
	private String frames;
	
	@JsonProperty("mp4")
	private String mp4;
	
	@JsonProperty("mp4_size")
	private String mp4Size;
	
	@JsonProperty("webp")
	private String webp;
	
	@JsonProperty("webp_size")
	private String webpSize;
	
	public Original(){}

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

	public String getFrames() {
		return frames;
	}

	public void setFrames(String frames) {
		this.frames = frames;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((frames == null) ? 0 : frames.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((mp4 == null) ? 0 : mp4.hashCode());
		result = prime * result + ((mp4Size == null) ? 0 : mp4Size.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((webp == null) ? 0 : webp.hashCode());
		result = prime * result
				+ ((webpSize == null) ? 0 : webpSize.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		Original other = (Original) obj;
		if (frames == null) {
			if (other.frames != null)
				return false;
		} else if (!frames.equals(other.frames))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (mp4 == null) {
			if (other.mp4 != null)
				return false;
		} else if (!mp4.equals(other.mp4))
			return false;
		if (mp4Size == null) {
			if (other.mp4Size != null)
				return false;
		} else if (!mp4Size.equals(other.mp4Size))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (webp == null) {
			if (other.webp != null)
				return false;
		} else if (!webp.equals(other.webp))
			return false;
		if (webpSize == null) {
			if (other.webpSize != null)
				return false;
		} else if (!webpSize.equals(other.webpSize))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
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
