package nesty.anzhy.testrecipes.data

import nesty.anzhy.testrecipes.models.DetailResponse
import nesty.anzhy.testrecipes.models.RecipesResponse
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val recipesApi: RecipesApi
) {
    suspend fun getRecipes(): Response<RecipesResponse>{
        return recipesApi.getRecipes()
    }

    suspend fun getRecipeDetails(uuid: String): DetailResponse{
        return recipesApi.getRecipeDetails(uuid)
    }
}