package com.cardosoedgar.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by edgarcardoso on 2/16/16.
 */
public class Movie {

    @SerializedName("imdbID") String id;
    @SerializedName("Title") String title;
    @SerializedName("Year") String year;
    @SerializedName("Poster") String poster;

    @Override
    public String toString() {
        return this.title + "("+ this.year +")";
    }
}