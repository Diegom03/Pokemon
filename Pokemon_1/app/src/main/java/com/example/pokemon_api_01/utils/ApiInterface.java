package com.example.pokemon_api_01.utils;

import com.example.pokemon_api_01.entities.Pokemon;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("pokemon")
    Call<ArrayList<Pokemon>> getPokemons();

    /*https://pokeapi.co/api/v2/pokemon?limit=20&offset=20*/
    @GET("pokemon/")
    Call<ArrayList<Pokemon>> getPokemon();

    Call<ArrayList<Pokemon>> getPokemons(@Query("limit") int limit, @Query("offset") int offset);
/*
    @GET("movie/{movie_id}")
    Call<Movie> getMovieDetails(@Path("movie_id") int movieId,
                @Query("api_key") String apiKey, @Query("append_to_response") String credits);
*/
}
