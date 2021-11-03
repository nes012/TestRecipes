package nesty.anzhy.testrecipes.data

import nesty.anzhy.testrecipes.models.RecipesItem
import nesty.anzhy.testrecipes.models.RecipesResponse
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val recipesApi: RecipesApi
) {

    suspend fun getRecipes(): Response<RecipesResponse>{
        return recipesApi.getRecipes()
    }

    suspend fun getRecipeDetails(uuid: String): RecipesItem{
        return recipesApi.getRecipeDetails(uuid)
    }
}