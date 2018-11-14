package com.example.fightchart.data

import com.example.fightchart.model.Event
import com.example.fightchart.model.Fighter
import com.example.fightchart.model.Media
import com.example.fightchart.model.OctagonGirl

object UfcRepository {

    suspend fun getFighters() : List<Fighter> {
        return resultOrThrowError(UfcApiService.service.fighters().await());
    }

    suspend fun getOctagonGirls() : List<OctagonGirl> {
        return resultOrThrowError(UfcApiService.service.octagonGirls().await());
    }

    suspend fun getEvents() : List<Event> {
        return resultOrThrowError(UfcApiService.service.events().await());
    }

    suspend fun getMedia() : List<Media> {
        return resultOrThrowError(UfcApiService.service.media().await());
    }

    private fun <T : Any> resultOrThrowError(result: Result<T>) : T {
        return result.getOrThrow()
    }
}