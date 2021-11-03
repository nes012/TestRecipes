package nesty.anzhy.testrecipes.data

import nesty.anzhy.testrecipes.models.DetailResponse
import nesty.anzhy.testrecipes.models.RecipesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RecipesApi {

    @GET("recipes")
    suspend fun getRecipes(): Response<RecipesResponse>

    @GET("recipes/{uuid}")
    suspend fun getRecipeDetails(@Path("uuid") uuid: String): DetailResponse
}
