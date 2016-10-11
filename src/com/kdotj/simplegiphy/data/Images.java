package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Images Object for the Giphy API containing all image information for a Giphy
 * @author Kyle Jablonski
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Images {
	
	@JsonProperty("fixed_height")
	private FixedImage fixedHeight;
	@JsonProperty("fixed_height_still")
	private Still fixedHeightStill;
	@JsonProperty("fixed_height_downsampled")
	private Downsampled fixedHeightDownsampled;
	@JsonProperty("fixed_width")
	private FixedImage fixedWidth;
	@JsonProperty("fixed_width_still")
	private Still fixedWidthStill;
	@JsonProperty("fixed_width_downsampled")
	private Downsampled fixedWidthDownsampled;
	@JsonProperty("fixed_height_small")
	private FixedImage fixedHeightSmall;
	@JsonProperty("fixed_height_small_still")
	private Still fixedHeightSmallStill;
	@JsonProperty("fixed_width_small")
	private FixedImage fixedWidthSmall;
	@JsonProperty("fixed_width_small_still")
	private Still fixedWidthSmallStill;
	@JsonProperty("downsized")
	private Downsized downsized;
	@JsonProperty("downsized_still")
	private DownsizedStill downsizedStill;
	@JsonProperty("downsized_large")
	private Downsized downsizedLarge;
	@JsonProperty("downsized_medium")
	private Downsized downsizedMedium;
	@JsonProperty("original")
	private Original original;
	@JsonProperty("original_still")
	private Still originalStill;
	
	public Images(){}

	public FixedImage getFixedHeight() {
		return fixedHeight;
	}

	public void setFixedHeight(FixedImage fixedHeight) {
		this.fixedHeight = fixedHeight;
	}

	public Still getFixedHeightStill() {
		return fixedHeightStill;
	}

	public void setFixedHeightStill(Still fixedHeightStill) {
		this.fixedHeightStill = fixedHeightStill;
	}

	public Downsampled getFixedHeightDownsampled() {
		return fixedHeightDownsampled;
	}

	public void setFixedHeightDownsampled(Downsampled fixedHeightDownsampled) {
		this.fixedHeightDownsampled = fixedHeightDownsampled;
	}

	public FixedImage getFixedWidth() {
		return fixedWidth;
	}

	public void setFixedWidth(FixedImage fixedWidth) {
		this.fixedWidth = fixedWidth;
	}

	public Still getFixedWidthStill() {
		return fixedWidthStill;
	}

	public void setFixedWidthStill(Still fixedWidthStill) {
		this.fixedWidthStill = fixedWidthStill;
	}

	public Downsampled getFixedWidthDownsampled() {
		return fixedWidthDownsampled;
	}

	public void setFixedWidthDownsampled(Downsampled fixedWidthDownsampled) {
		this.fixedWidthDownsampled = fixedWidthDownsampled;
	}

	public FixedImage getFixedHeightSmall() {
		return fixedHeightSmall;
	}

	public void setFixedHeightSmall(FixedImage fixedHeightSmall) {
		this.fixedHeightSmall = fixedHeightSmall;
	}

	public Still getFixedHeightSmallStill() {
		return fixedHeightSmallStill;
	}

	public void setFixedHeightSmallStill(Still fixedHeightSmallStill) {
		this.fixedHeightSmallStill = fixedHeightSmallStill;
	}

	public FixedImage getFixedWidthSmall() {
		return fixedWidthSmall;
	}

	public void setFixedWidthSmall(FixedImage fixedWidthSmall) {
		this.fixedWidthSmall = fixedWidthSmall;
	}

	public Still getFixedWidthSmallStill() {
		return fixedWidthSmallStill;
	}

	public void setFixedWidthSmallStill(Still fixedWidthSmallStill) {
		this.fixedWidthSmallStill = fixedWidthSmallStill;
	}

	public Downsized getDownsized() {
		return downsized;
	}

	public void setDownsized(Downsized downsized) {
		this.downsized = downsized;
	}

	public DownsizedStill getDownsizedStill() {
		return downsizedStill;
	}

	public void setDownsizedStill(DownsizedStill downsizedStill) {
		this.downsizedStill = downsizedStill;
	}

	public Downsized getDownsizedLarge() {
		return downsizedLarge;
	}

	public void setDownsizedLarge(Downsized downsizedLarge) {
		this.downsizedLarge = downsizedLarge;
	}

	public Downsized getDownsizedMedium() {
		return downsizedMedium;
	}

	public void setDownsizedMedium(Downsized downsizedMedium) {
		this.downsizedMedium = downsizedMedium;
	}

	public Original getOriginal() {
		return original;
	}

	public void setOriginal(Original original) {
		this.original = original;
	}

	public Still getOriginalStill() {
		return originalStill;
	}

	public void setOriginalStill(Still originalStill) {
		this.originalStill = originalStill;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((downsized == null) ? 0 : downsized.hashCode());
		result = prime * result
				+ ((downsizedLarge == null) ? 0 : downsizedLarge.hashCode());
		result = prime * result
				+ ((downsizedMedium == null) ? 0 : downsizedMedium.hashCode());
		result = prime * result
				+ ((downsizedStill == null) ? 0 : downsizedStill.hashCode());
		result = prime * result
				+ ((fixedHeight == null) ? 0 : fixedHeight.hashCode());
		result = prime
				* result
				+ ((fixedHeightDownsampled == null) ? 0
						: fixedHeightDownsampled.hashCode());
		result = prime
				* result
				+ ((fixedHeightSmall == null) ? 0 : fixedHeightSmall.hashCode());
		result = prime
				* result
				+ ((fixedHeightSmallStill == null) ? 0 : fixedHeightSmallStill
						.hashCode());
		result = prime
				* result
				+ ((fixedHeightStill == null) ? 0 : fixedHeightStill.hashCode());
		result = prime * result
				+ ((fixedWidth == null) ? 0 : fixedWidth.hashCode());
		result = prime
				* result
				+ ((fixedWidthDownsampled == null) ? 0 : fixedWidthDownsampled
						.hashCode());
		result = prime * result
				+ ((fixedWidthSmall == null) ? 0 : fixedWidthSmall.hashCode());
		result = prime
				* result
				+ ((fixedWidthSmallStill == null) ? 0 : fixedWidthSmallStill
						.hashCode());
		result = prime * result
				+ ((fixedWidthStill == null) ? 0 : fixedWidthStill.hashCode());
		result = prime * result
				+ ((original == null) ? 0 : original.hashCode());
		result = prime * result
				+ ((originalStill == null) ? 0 : originalStill.hashCode());
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
		Images other = (Images) obj;
		if (downsized == null) {
			if (other.downsized != null)
				return false;
		} else if (!downsized.equals(other.downsized))
			return false;
		if (downsizedLarge == null) {
			if (other.downsizedLarge != null)
				return false;
		} else if (!downsizedLarge.equals(other.downsizedLarge))
			return false;
		if (downsizedMedium == null) {
			if (other.downsizedMedium != null)
				return false;
		} else if (!downsizedMedium.equals(other.downsizedMedium))
			return false;
		if (downsizedStill == null) {
			if (other.downsizedStill != null)
				return false;
		} else if (!downsizedStill.equals(other.downsizedStill))
			return false;
		if (fixedHeight == null) {
			if (other.fixedHeight != null)
				return false;
		} else if (!fixedHeight.equals(other.fixedHeight))
			return false;
		if (fixedHeightDownsampled == null) {
			if (other.fixedHeightDownsampled != null)
				return false;
		} else if (!fixedHeightDownsampled.equals(other.fixedHeightDownsampled))
			return false;
		if (fixedHeightSmall == null) {
			if (other.fixedHeightSmall != null)
				return false;
		} else if (!fixedHeightSmall.equals(other.fixedHeightSmall))
			return false;
		if (fixedHeightSmallStill == null) {
			if (other.fixedHeightSmallStill != null)
				return false;
		} else if (!fixedHeightSmallStill.equals(other.fixedHeightSmallStill))
			return false;
		if (fixedHeightStill == null) {
			if (other.fixedHeightStill != null)
				return false;
		} else if (!fixedHeightStill.equals(other.fixedHeightStill))
			return false;
		if (fixedWidth == null) {
			if (other.fixedWidth != null)
				return false;
		} else if (!fixedWidth.equals(other.fixedWidth))
			return false;
		if (fixedWidthDownsampled == null) {
			if (other.fixedWidthDownsampled != null)
				return false;
		} else if (!fixedWidthDownsampled.equals(other.fixedWidthDownsampled))
			return false;
		if (fixedWidthSmall == null) {
			if (other.fixedWidthSmall != null)
				return false;
		} else if (!fixedWidthSmall.equals(other.fixedWidthSmall))
			return false;
		if (fixedWidthSmallStill == null) {
			if (other.fixedWidthSmallStill != null)
				return false;
		} else if (!fixedWidthSmallStill.equals(other.fixedWidthSmallStill))
			return false;
		if (fixedWidthStill == null) {
			if (other.fixedWidthStill != null)
				return false;
		} else if (!fixedWidthStill.equals(other.fixedWidthStill))
			return false;
		if (original == null) {
			if (other.original != null)
				return false;
		} else if (!original.equals(other.original))
			return false;
		if (originalStill == null) {
			if (other.originalStill != null)
				return false;
		} else if (!originalStill.equals(other.originalStill))
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
