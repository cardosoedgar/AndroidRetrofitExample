package com.cardosoedgar.retrofitexample;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edgarcardoso on 2/16/16.
 */
public class SearchResult {

    @SerializedName("Search") List<Movie> movieList;
    @SerializedName("totalResults") int totalResults;

    public SearchResult() {
        movieList = new ArrayList<>();
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
