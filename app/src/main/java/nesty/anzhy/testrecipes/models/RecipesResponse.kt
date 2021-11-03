package nesty.anzhy.testrecipes.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class RecipesResponse(

	@field:SerializedName("recipes")
	val recipes: List<RecipesItem?>? = null
) : Parcelable

