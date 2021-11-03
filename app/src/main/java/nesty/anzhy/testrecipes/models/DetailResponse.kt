package nesty.anzhy.testrecipes.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DetailResponse(
	@field:SerializedName("difficulty")
	val difficulty: Int? = null,

	@field:SerializedName("lastUpdated")
	val lastUpdated: Int? = null,

	@field:SerializedName("instructions")
	val instructions: String? = null,

	@field:SerializedName("similar")
	val similar: List<SimilarItem?>? = null,

	@field:SerializedName("images")
	val images: List<String?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
) : Parcelable
