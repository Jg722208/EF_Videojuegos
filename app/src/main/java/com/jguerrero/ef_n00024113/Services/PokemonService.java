package com.jguerrero.ef_n00024113.Services;

import com.jguerrero.ef_n00024113.clases.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PokemonService {

    @GET("pokemons/N00024113")
    Call<List<Pokemon>> getAll();

    @POST("pokemons/N00024113/crear")
    Call<Pokemon> create(@Body Pokemon pokemon);
}
