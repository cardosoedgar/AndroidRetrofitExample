package com.cardosoedgar.retrofitexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.omdbapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        OMDBService service = retrofit.create(OMDBService.class);

        service.getMovies("Star Wars", "movie").enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                if(response.code() != 200)
                    return;

                System.out.println("CODE: " +response.code());
                for(Movie movie : response.body().getMovieList()) {
                    System.out.println(movie);
                }
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
}
