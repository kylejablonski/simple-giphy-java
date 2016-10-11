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

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import com.kdotj.simplegiphy.data.GiphyListResponse;
import com.kdotj.simplegiphy.data.RandomGiphyResponse;
import com.kdotj.simplegiphy.data.SimpleGiphyResponse;

/**
 * Giphy Service for getting the Giphy data or Sticker data
 * <p>Both stickers and Giphy's return the same types of objects, they just contain different information from the Giphy API</p>
 * @author Kyle Jablonski
 *
 */
public interface GiphyService {

	/*-------------------------------------------------------------------------------------------
	 * 	Giphy Api
	 ------------------------------------------------------------------------------------------*/
	
	@GET("gifs/{gif_id}")
	Call<SimpleGiphyResponse> gifById(@Path("gif_id") String giphyId);
	
	@GET("gifs")
	Call<GiphyListResponse> gifByIds(@Query("ids") String ids);
	
	@GET("gifs/search")
	Call<GiphyListResponse> search(@Query("q") String query, @Query("limit") String limit, @Query("offset") String offset, @Query("rating") String rating);
	
	@GET("gifs/trending")
		Call<GiphyListResponse> trending(@Query("limit") String limit, @Query("rating") String rating);
	
	@GET("gifs/random")
	Call<RandomGiphyResponse> random(@Query("tag") String tag, @Query("rating") String rating);
	
	@GET("gifs/translate")
	Call<SimpleGiphyResponse> translate(@Query("s") String term, @Query("rating") String rating);
	
	/*-------------------------------------------------------------------------------------------
	 * 	Stickers Api
	 ------------------------------------------------------------------------------------------*/
	
	@GET("stickers/search")
	Call<GiphyListResponse> searchStickers(@Query("q") String query, @Query("limit") String limit, @Query("offset") String offset, @Query("rating") String rating);
	
	@GET("stickers/random")
	Call<RandomGiphyResponse> randomSticker(@Query("tag") String tag, @Query("rating") String rating);
	
	@GET("stickers/trending")
	Call<GiphyListResponse> trendingStickers(@Query("limit") String limit, @Query("rating") String rating);
	
	@GET("stickers/translate")
	Call<SimpleGiphyResponse> translateSticker(@Query("s") String term, @Query("rating") String rating);
}
