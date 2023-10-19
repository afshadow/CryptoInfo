package net.embits.markets.data.net

import retrofit2.http.GET

/*
* https://tradeogre.com/help/api
*
*/
interface TradeOgreApi {

    @GET("/markets")
    suspend fun markets()

    companion object {
        const val TRADE_OGRE_API = "https://tradeogre.com/api/v1"
    }
}