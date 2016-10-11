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
	
	static SimpleGiphy mInstance;
	
	static{
		
		mInstance = SimpleGiphy.getInstance();
	}
	
	@Test
	public void testRandom(){
		System.out.println("testRandom() -> american+psycho");
		System.out.println("");
		
		RandomGiphyResponse randomGiphyResponse = mInstance.random("american+psycho",null);
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
		
		GiphyListResponse trendingResponse = mInstance.trending("1", "pg-13");
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
		
		GiphyListResponse listResponse = mInstance.search("cats", "2", "0" , "pg-13");
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
		
		SimpleGiphyResponse translateResponse = mInstance.translate("awesome", "pg-13");
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
		
		SimpleGiphyResponse giphyByIdResponse = mInstance.gifById("11V54nIH3eDQK4");
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
		
		GiphyListResponse giphyByIdResponse = mInstance.gifByIds("11V54nIH3eDQK4,3o85xGRWMlHdGB1vMs,1ecRID74uAe5i");
		List<Giphy> giphyListResponse = giphyByIdResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(giphyListResponse));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(giphyListResponse);
	}
	

	@Test
	public void testRandomSticker(){
		System.out.println("testRandomSticker() -> american+psycho");
		System.out.println("");
		
		RandomGiphyResponse randomGiphyResponse = mInstance.randomSticker("oops", "pg-13");
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
		
		GiphyListResponse trendingResponse = mInstance.trendingStickers("1", "pg-13");
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
		GiphyListResponse listResponse = mInstance.searchStickers("cats", "2", "0" , "pg-13");
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
		SimpleGiphyResponse translateResponse = mInstance.translateSticker("awesome", "pg-13");
		Giphy giphy = translateResponse.getData();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(giphy));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertNotNull(giphy);
	}
}
