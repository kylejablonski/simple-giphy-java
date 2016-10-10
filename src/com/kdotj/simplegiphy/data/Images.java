package com.kdotj.simplegiphy.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images {
	
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
}
