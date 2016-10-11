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

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import com.kdotj.simplegiphy.data.GiphyListResponse;
import com.kdotj.simplegiphy.data.RandomGiphyResponse;
import com.kdotj.simplegiphy.data.SimpleGiphyResponse;

/**
 * Simple Giphy Api Library. All responses are currently returned using Jackson and JSON
 * <p>
 * This class is setup as a singleton so once it is configured you can use the Instance to make
 * all calls for the Library
 * <p>
 * NOTE: Support for XML may be needed and will only be created if requested
 * @author Kyle Jablonski
 *
 */
public final class SimpleGiphy {
	
	/**
	 * Base Url for the Giphy Api
	 */
	private static final String BASE_URL = "http://api.giphy.com/v1/";
	
	/**
	 * API key for fetching data
	 * DEV API KEY, won't work for production Apps, replace with your own API Key
	 */
	private static String mGiphyApiKey = "dc6zaTOxFJmzC";
	
	/**
	 * Interface implementation Object for the API calls
	 */
	private static GiphyService mService;
	
	/**
	 * Singleton instance of this class for ease of use
	 */
	private static SimpleGiphy mInstance;
	
	/**
	 * Api key setter for the Giphy API
	 * <p>Call this before using the service, otherwise the dev API Key will be used. This is not recommended for use in production code.</p>
	 * @param apiKey giphy api key
	 */
	public static void setApiKey(String apiKey){
		mGiphyApiKey = apiKey;
	}
	
	/**
	 * Creates an Instance of {@link SimpleGiphy} if its null and
	 * the {@link GiphyService} object for making API calls
	 * @return this
	 */
	public static SimpleGiphy getInstance(){
		if(mInstance == null){
			mInstance = new SimpleGiphy();
			mService = setupCall();
		}		
		return mInstance;
	}
	
	/**
	 * Private constructor hidden from the outside world.
	 * {@see #getInstance}
	 */
	private SimpleGiphy(){}
	
	/**
	 * Sets the API Call up by adding the api_key query param to every call
	 */
	private static GiphyService setupCall(){
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		httpClient.addInterceptor(new Interceptor() {
			
			@Override
			public Response intercept(Chain chain) throws IOException {
				Request original = chain.request();
				HttpUrl originalHttpUrl = original.url();
				
				HttpUrl url = originalHttpUrl.newBuilder()
		                .addQueryParameter("api_key", mGiphyApiKey)
		                .build();

				Request request = original.newBuilder()
//						.addHeader("","")
						.method(original.method(), original.body())
						.url(url)
						.build();
				
				return chain.proceed(request);
			}
		});
		
		OkHttpClient client = httpClient.build();
		Retrofit retroFit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.client(client)
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		return retroFit.create(GiphyService.class);
	}
	
	/**
	 * Requests a list of Giphys by comma separated list of Id
	 * @param giphyIds the comma separated list of id's to request
	 * @return {@link GiphyListResponse} containing meta and pagination information
	 */
	public GiphyListResponse gifByIds(String giphyIds){
		
		Call<GiphyListResponse> call = mService.gifByIds(giphyIds);
		if(call != null){
			try {
				retrofit2.Response<GiphyListResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Requests a single Giphy via its Id
	 * @param giphyId the id fo the Giphy to fetch
	 * @return the {@link SimpleGiphyResponse} representation of the Giphy fetched by id
	 */
	public SimpleGiphyResponse gifById(String giphyId){
		
		Call<SimpleGiphyResponse> call = mService.gifById(giphyId);
		if(call != null){
			try {
				retrofit2.Response<SimpleGiphyResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Request to search for a Giphy
	 * @param query the query term to search by
	 * @param limit the limit of results
	 * @param offset the page offset
	 * @param rating the rating for the giphy
	 * @return the {@link GiphyListResponse}
	 */
	public GiphyListResponse search(String query, String limit, String offset, String rating){
		
		Call<GiphyListResponse> call = mService.search(query, limit, offset, rating);
		if(call != null){
			try {
				retrofit2.Response<GiphyListResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Requests the trending Giphy's same as the giphy.com homepage
	 * @param limit the limit of results
	 * @param rating the rating for the giphy's
	 * @return the {@link GiphyListResponse}
	 */
	public GiphyListResponse trending(String limit, String rating){

		Call<GiphyListResponse> call = mService.trending(limit, rating);
		if(call != null){
			try {
				retrofit2.Response<GiphyListResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Request a random qiphy
	 * @param tag the tag to get a random giphy
	 * @param rating the rating for the giphy's
	 * @return the {@link RandomGiphyResponse}
	 */
	public RandomGiphyResponse random(String tag, String rating){

		Call<RandomGiphyResponse> call = mService.random(tag, rating);
		if(call != null){
			try {
				retrofit2.Response<RandomGiphyResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Request translates a term to a Giphy
	 * @param term the term to translate to a giphy
	 * @param rating the rating for the gipy
	 * @return the {@link SimpleGiphyResponse}
	 */
	public SimpleGiphyResponse translate(String term, String rating){

		Call<SimpleGiphyResponse> call = mService.translate(term, rating);
		if(call != null){
			try {
				retrofit2.Response<SimpleGiphyResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Search request through the Giphy API
	 * @param query params for the query
	 * @param limit result limit
	 * @param offset result offset
	 * @param rating content rating
	 * @return {@link GiphyListResponse}
	 */
	public GiphyListResponse searchStickers(String query, String limit, String offset, String rating){
		
		Call<GiphyListResponse> call = mService.searchStickers(query, limit, offset, rating);
		if(call != null){
			try {
				retrofit2.Response<GiphyListResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Random Giphy request through the Giphy API
	 * @param tag the tag to use for random 
	 * @param rating content rating
	 * @return {@link RandomGiphyResponse}
	 */
	public RandomGiphyResponse randomSticker(String tag, String rating){
		
		Call<RandomGiphyResponse> call = mService.randomSticker(tag, rating);
		if(call != null){
			try {
				retrofit2.Response<RandomGiphyResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Request to get trending stickers through the Giphy API
	 * @param limit result limit
	 * @param rating content rating
	 * @return {@link GiphyListResponse}
	 */
	public GiphyListResponse trendingStickers(String limit, String rating){

		Call<GiphyListResponse> call = mService.trendingStickers(limit, rating);
		if(call != null){
			try {
				retrofit2.Response<GiphyListResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * Request translates a term to a Giphy Sticker
	 * @param term the term to translate to a giphy sticker
	 * @param rating the rating for the giphy sticker
	 * @return the {@link SimpleGiphyResponse}
	 */
	public SimpleGiphyResponse translateSticker(String term, String rating){
		
		Call<SimpleGiphyResponse> call = mService.translateSticker(term, rating);
		if(call != null){
			try {
				retrofit2.Response<SimpleGiphyResponse> response = call.execute();
				return response.body();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
