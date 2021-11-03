package nesty.anzhy.testrecipes.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import nesty.anzhy.matkonim.util.NetworkResult
import nesty.anzhy.testrecipes.data.Repository
import nesty.anzhy.testrecipes.models.DetailResponse
import nesty.anzhy.testrecipes.models.RecipesItem
import nesty.anzhy.testrecipes.models.RecipesResponse
import javax.inject.Inject


@HiltViewModel
class ViewModel @Inject constructor(
    private val repository: Repository,
    application: Application
) : AndroidViewModel(application) {

    var recipesResponse: MutableLiveData<NetworkResult<RecipesResponse>> = MutableLiveData()
    var detailResponse: MutableLiveData<NetworkResult<DetailResponse>> = MutableLiveData()



}