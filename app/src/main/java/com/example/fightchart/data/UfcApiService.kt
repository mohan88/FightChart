package com.example.fightchart.data

import com.example.fightchart.model.Event
import com.example.fightchart.model.Fighter
import com.example.fightchart.model.Media
import com.example.fightchart.model.OctagonGirl
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

object UfcApiService {

    val BASE_URL = "http://ufc-data-api.ufc.com"

    interface Service {

        @GET("/api/v3/iphone/fighters")
        fun fighters(): Deferred<Result<List<Fighter>>>

        @GET("/api/v3/iphone/fighters/{id}")
        fun fighterById(@Path("id") id: Int): Deferred<Result<Fighter>>

        @GET("/api/v3/iphone/octagon_girls")
        fun octagonGirls(): Deferred<Result<List<OctagonGirl>>>

        @GET("/api/v3/iphone/octagon_girls/{id}")
        fun octagonGirlById(@Path("id") id: Int): Deferred<Result<OctagonGirl>>

        @GET("/api/v3/iphone/events")
        fun events(): Deferred<Result<List<Event>>>

        @GET("/api/v3/iphone/events/{id}")
        fun eventById(@Path("id") id: Int): Deferred<Result<Event>>

        @GET("/api/v3/iphone/media")
        fun media(): Deferred<Result<List<Media>>>

        @GET("/api/v3/iphone/media/{id}")
        fun mediaById(@Path("id") id: Int): Deferred<Result<Media>>

    }

    val service =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
            .create(Service::class.java)!!
}