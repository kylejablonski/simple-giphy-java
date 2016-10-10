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
 * Simple Giphy Api Library. All responses are currently returned using Gson and Json
 * <p>
 * NOTE: Support for XML may be needed and will only be created if requested
 * @author kyle.jablonski
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
	private static final String GIPHY_DEV_API_KEY = "dc6zaTOxFJmzC";
	
	/**
	 * Retrofit object for making requests
	 */
	private Retrofit mRetroFit;
	
	/**
	 * Interface implementation Object for the API calls
	 */
	private GiphyService mService;
	
	/**
	 * Requests a list of Giphys by comma separated list of Id
	 * @param giphyIds the comma separated list of id's to request
	 * @return {@link GiphyListResponse} containing meta and pagination information
	 */
	public GiphyListResponse gifByIds(String giphyIds){
		
		setupCall();
		
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
		
		setupCall();
		
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
	 * @return the {@Link GiphyListResponse}
	 */
	public GiphyListResponse search(String query, String limit, String offset, String rating){
		setupCall();
		
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
	 * @return the {@Link GiphyListResponse}
	 */
	public GiphyListResponse trending(String limit, String rating){
		setupCall();
		
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
		
		setupCall();
		
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
		
		setupCall();
		
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
		setupCall();
		
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
		setupCall();
		
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
		setupCall();
		
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
		
		setupCall();
		
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
	
	/**
	 * Sets the API Call up by adding the api_key query param to every call
	 */
	private void setupCall(){
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		httpClient.addInterceptor(new Interceptor() {
			
			@Override
			public Response intercept(Chain chain) throws IOException {
				Request original = chain.request();
				HttpUrl originalHttpUrl = original.url();
				
				HttpUrl url = originalHttpUrl.newBuilder()
		                .addQueryParameter("api_key", GIPHY_DEV_API_KEY)
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
		mRetroFit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.client(client)
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		
		mService = mRetroFit.create(GiphyService.class);
	}

}
