package com.example.moviebeta.network;

import com.example.moviebeta.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET(Constant.MOVIE_PATH+"/popular")
    Call<Movie>popularMovies(
            @Query("page")int page);

}
