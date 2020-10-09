package com.thescienceset.retrofitapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface GamesService {
    @Headers({"user-key: 0085a54f7b9cd3527750f422ae4ddf88", "Accept: application/json", "Content-Type: text/plain"})

    @POST("/games")
    Call<List<Game>> getGames(@Body String query);
}
