package com.kdotj.simplegiphy;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kdotj.simplegiphy.data.Giphy;
import com.kdotj.simplegiphy.data.GiphyListResponse;
import com.kdotj.simplegiphy.data.RandomGiphyResponse;
import com.kdotj.simplegiphy.data.SimpleGiphyResponse;

public class SimpleGiphyStickerTest {

	@Test
	public void testRandomSticker(){
		System.out.println("testRandomSticker() -> american+psycho");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		RandomGiphyResponse randomGiphyResponse = simpleGiphy.randomSticker("oops", "pg-13");
		try {
			System.out.println(new ObjectMapper().writeValueAsString(randomGiphyResponse.getRandomGiphy()));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(randomGiphyResponse.getRandomGiphy());
	}
	
	@Test
	public void testTrendingStickers(){
		System.out.println("testTrendingStickers() -> 1, pg-13");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		GiphyListResponse trendingResponse = simpleGiphy.trendingStickers("1", "pg-13");
		List<Giphy> trendingList = trendingResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(trendingResponse));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(trendingList);
	}
	
	@Test
	public void testSearchStickers(){
		System.out.println("testSearchSticker() -> cats, 2, 0, pg-13");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		GiphyListResponse listResponse = simpleGiphy.searchStickers("cats", "2", "0" , "pg-13");
		List<Giphy> trendingList = listResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(listResponse));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(trendingList);
	}
	
	@Test
	public void testTranslateSticker(){
		System.out.println("testTranslateSticker() -> awesome, pg-13");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		SimpleGiphyResponse translateResponse = simpleGiphy.translateSticker("awesome", "pg-13");
		Giphy giphy = translateResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(giphy));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(giphy);
	}
}
