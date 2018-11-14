package com.example.fightchart.model

import com.squareup.moshi.Json

data class OctagonGirl(
    @Json(name = "banner_background_image")
    val bannerBackgroundImage: String = "", // http://media.ufc.tv/octagongirls/025846_WEB_RedDelaCruz_UFCcom_HEADER.jpg
    @Json(name = "biography1")
    val biography1: String = "", // <div>Born in Quezon City and spending much of her early Childhood in the Province of Zambales Red shared the dreams of many young Filipinas of Performing and being &ldquo;Famous&rdquo; one day After Studying Tourism at Far Eastern University, Red embarked on a modelling career after being approached by numerous photographers and publishers. After appearing in many local and international magazines as well as being the number one Ring Girl in a local MMA Organisation, Red developed a real following on Social Media and now has millions of Fans on Facebook, Twitter, Instagram and Youtube.</div><div><br />Her fans and followers are her priority. Through her close affinity with her followers she was voted in FHM&rsquo;s 100 Sexiest Women in the World for three straight years being #52 in 2013, #81 in 2014 and #71 in 2015.</div>
    @Json(name = "biography2")
    val biography2: String = "", // <div>ext came the opportunity of being the first Filipina Octagon Girl in the UFC and to work alongside one of her Idols Arianny Celeste. This was too tempting to ignore so she entered the UFC Octagon Girl Search, was shortlisted and found her way to the top 5. When it came down to the FANS DECIDING via voting her followers came to her help as always and voted in their thousands.</div><div><br />As the first winner of the first Octagon Girl Search in Asia, Red commented&hellip;<br />This win is for all my family friends and fans who believed in me, helped and supported me every step of the way whether they are here in the Philippines or Internationally. I feel so honored and blessed to be the first Filipina Octagon Girl in the UFC and very proud to be Pinoy!</div>
    @Json(name = "biography_header")
    val biographyHeader: String = "",
    @Json(name = "career_goals")
    val careerGoals: String = "", // To be MMA Octagon Girl of the Year
    @Json(name = "city_residing")
    val cityResiding: String = "", // Manila
    @Json(name = "country_residing")
    val countryResiding: String = "", // Philippines
    @Json(name = "date_of_birth")
    val dateOfBirth: String = "", // 1992-10-09T00:00:00Z
    @Json(name = "favorite_foods")
    val favoriteFoods: String = "", // Anything healthy except cheat day which is Pizza & Pasta
    @Json(name = "favoritetvshows")
    val favoritetvshows: String = "", // Gumballs, Tom & Jerry Cartoons
    @Json(name = "first_name")
    val firstName: String = "", // Red
    @Json(name = "gallery")
    val gallery: List<Any> = listOf(),
    @Json(name = "height")
    val height: Int = 0, // 65
    @Json(name = "hobbies")
    val hobbies: String = "", // Dancing, Singing, Gym, Beach, Travelling
    @Json(name = "id")
    val id: Int = 0, // 585937
    @Json(name = "large_body_picture")
    val largeBodyPicture: Any? = Any(), // null
    @Json(name = "large_profile_picture")
    val largeProfilePicture: String = "", // http://media.ufc.tv/octagongirls/025846_WEB_RedDelaCruz_UFCcom_LG.jpg
    @Json(name = "last_name")
    val lastName: String = "", // Dela Cruz
    @Json(name = "medium_profile_picture")
    val mediumProfilePicture: String = "", // http://media.ufc.tv/octagongirls/025846_WEB_RedDelaCruz_UFCcom_MED.jpg
    @Json(name = "octagon_girl_media_id")
    val octagonGirlMediaId: Any? = Any(), // null
    @Json(name = "quote")
    val quote: String = "", // “Dream for the imposible, It just might happen”.
    @Json(name = "short_description")
    val shortDescription: String = "", // Combining the best strenghts of beauty, personality and atittude of Filipino-Spanish Ancestry
    @Json(name = "state_residing")
    val stateResiding: String = "", // Luzon
    @Json(name = "storeurl")
    val storeurl: String = "",
    @Json(name = "turn_ons")
    val turnOns: String = "", // When he “accidently” grabs your ass.
    @Json(name = "twitter_feed_file_name")
    val twitterFeedFileName: Any? = Any(), // null
    @Json(name = "twitter_hashtag")
    val twitterHashtag: String = "",
    @Json(name = "twitter_username")
    val twitterUsername: String = "", // red_delacruz
    @Json(name = "ways_to_pick_up")
    val waysToPickUp: String = "",
    @Json(name = "websiteurl")
    val websiteurl: String = "", // http://www.reddelacruz.com
    @Json(name = "weight")
    val weight: Int = 0, // 0
    @Json(name = "youtube_channelurl")
    val youtubeChannelurl: String = "" // https://www.youtube.com/watch?v=VCzuf7xdP6c
)