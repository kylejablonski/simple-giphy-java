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

public class SimpleGiphyTest {
	
	@Test
	public void testRandom(){
		System.out.println("testRandom() -> american+psycho");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		RandomGiphyResponse randomGiphyResponse = simpleGiphy.random("american+psycho",null);
		try {
			System.out.println(new ObjectMapper().writeValueAsString(randomGiphyResponse.getRandomGiphy()));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(randomGiphyResponse.getRandomGiphy());
	}
	
	@Test
	public void testTrending(){
		System.out.println("testTrending() -> 1, pg-13");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		GiphyListResponse trendingResponse = simpleGiphy.trending("1", "pg-13");
		List<Giphy> trendingList = trendingResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(trendingList));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(trendingList);
	}
	
	@Test
	public void testSearch(){
		System.out.println("testSearch() -> cats, 2, 0, pg-13");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		GiphyListResponse listResponse = simpleGiphy.search("cats", "2", "0" , "pg-13");
		List<Giphy> trendingList = listResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(listResponse));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(trendingList);
	}
	
	@Test
	public void testTranslate(){
		System.out.println("testTranslate() -> awesome, pg-13");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		SimpleGiphyResponse translateResponse = simpleGiphy.translate("awesome", "pg-13");
		Giphy giphy = translateResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(giphy));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(giphy);
	}
	
	@Test
	public void testById(){
		System.out.println("testById() -> 11V54nIH3eDQK4");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		SimpleGiphyResponse giphyByIdResponse = simpleGiphy.gifById("11V54nIH3eDQK4");
		Giphy giphy = giphyByIdResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(giphy));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(giphy);
	}

	@Test
	public void testByIds(){
		System.out.println("testByIds() -> 11V54nIH3eDQK4,3o85xGRWMlHdGB1vMs,1ecRID74uAe5i");
		System.out.println("");
		SimpleGiphy simpleGiphy = new SimpleGiphy();
		GiphyListResponse giphyByIdResponse = simpleGiphy.gifByIds("11V54nIH3eDQK4,3o85xGRWMlHdGB1vMs,1ecRID74uAe5i");
		List<Giphy> giphyListResponse = giphyByIdResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(giphyListResponse));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(giphyListResponse);
	}
}
