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
 * @author kyle.jablonski
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
