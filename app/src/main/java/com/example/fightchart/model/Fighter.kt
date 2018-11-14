package com.example.fightchart.model

import com.squareup.moshi.Json

data class Fighter(
    @Json(name = "belt_thumbnail")
    val beltThumbnail: String = "", // http://imagec.ufc.com/http%253A%252F%252Fmedia.ufc.tv%252Ffighter_images%252FChris_Holdsworth%252FChrisHoldsworth_UNIFORM_TUF18_012-PRINT.png?w600-h600-tc1
    @Json(name = "draws")
    val draws: Int = 0, // 0
    @Json(name = "fighter_status")
    val fighterStatus: String = "", // Active
    @Json(name = "first_name")
    val firstName: String = "", // Michel
    @Json(name = "id")
    val id: Int = 0, // 619989
    @Json(name = "last_name")
    val lastName: String = "", // Quinones
    @Json(name = "left_full_body_image")
    val leftFullBodyImage: String = "", // http://imagec.ufc.com/http%253A%252F%252Fmedia.ufc.tv%252Ffighter_images%252FMichel_Quinones%252FQUINONES_MICHEL_R.png?mh530
    @Json(name = "link")
    val link: String = "", // http://www.ufc.com/fighter/michael-quinones
    @Json(name = "losses")
    val losses: Int = 0, // 3
    @Json(name = "nickname")
    val nickname: String = "", // Capo
    @Json(name = "pound_for_pound_rank")
    val poundForPoundRank: Any? = Any(), // null
    @Json(name = "profile_image")
    val profileImage: String = "", // http://imagec.ufc.com/http%253A%252F%252Fmedia.ufc.tv%252Ffighter_images%252FMichel_Quinones%252FQUINONES_MICHEL.png?w600-h600-tc1
    @Json(name = "rank")
    val rank: Any? = Any(), // null
    @Json(name = "right_full_body_image")
    val rightFullBodyImage: String = "", // http://imagec.ufc.com/http%253A%252F%252Fmedia.ufc.tv%252Ffighter_images%252FMichel_Quinones%252FQUINONES_MICHEL_R.png?mh530
    @Json(name = "statid")
    val statid: Int = 0, // 2865
    @Json(name = "thumbnail")
    val thumbnail: String = "", // http://imagec.ufc.com/http%253A%252F%252Fmedia.ufc.tv%252Fgenerated_images_sorted%252FFighter%252Fmichael-quinones%252Fmichael-quinones_619989_medium_thumbnail.jpg?w640-h320-tc1
    @Json(name = "title_holder")
    val titleHolder: Boolean = false, // false
    @Json(name = "weight_class")
    val weightClass: String = "", // Lightweight
    @Json(name = "wins")
    val wins: Int = 0 // 8
)