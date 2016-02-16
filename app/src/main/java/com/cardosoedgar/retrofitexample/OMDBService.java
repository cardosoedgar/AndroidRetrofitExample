package com.cardosoedgar.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by edgarcardoso on 2/16/16.
 */
public interface OMDBService {

    @GET("http://www.omdbapi.com")
    Call<SearchResult> getMovies(@Query("s") String movieName, @Query("type") String type);
}
