package com.example.fightchart.model

import com.squareup.moshi.Json

data class Media(
    @Json(name = "created")
    val created: String = "", // 2018-10-31T17:49:26Z
    @Json(name = "description")
    val description: String = "", // UFC 230 heavyweight title contender Derrick Lewis sits down with Megan Olivi to talk about the whirlwind past few weeks for Lewis and his upcoming matchup with Daniel Cormier.
    @Json(name = "embedded_id")
    val embeddedId: String = "", // o4mtNRw_kcQ
    @Json(name = "embedded_type")
    val embeddedType: String = "", // YOUTUBEVIDEO
    @Json(name = "id")
    val id: Int = 0, // 666742
    @Json(name = "internal_url")
    val internalUrl: String = "",
    @Json(name = "keyword_ids")
    val keywordIds: List<Int> = listOf(),
    @Json(name = "last_modified")
    val lastModified: String = "", // 2018-10-31T17:50:31Z
    @Json(name = "media_date")
    val mediaDate: String = "", // 2018-10-31T00:00:00Z
    @Json(name = "mobile_stream_url")
    val mobileStreamUrl: Any? = Any(), // null
    @Json(name = "mobile_video_url")
    val mobileVideoUrl: Any? = Any(), // null
    @Json(name = "more_link_text")
    val moreLinkText: String = "",
    @Json(name = "more_linkurl")
    val moreLinkurl: String = "",
    @Json(name = "published_start_date")
    val publishedStartDate: String = "", // 2018-10-31T17:50:00Z
    @Json(name = "thumbnail")
    val thumbnail: String = "", // http://imagec.ufc.com/http%253A%252F%252Fmedia.ufc.tv%252FGettyImages-1055767012.jpg?w640-h320-tc1
    @Json(name = "title")
    val title: String = "", // UFC 230: Derrick Lewis - I Say Crazy Stuff All the Time
    @Json(name = "type")
    val type: String = "", // EMBEDDEDVIDEO
    @Json(name = "url_name")
    val urlName: String = "" // UFC-230-Derrick-Lewis-I-Say-Crazy-Stuff-All-the-Time
)