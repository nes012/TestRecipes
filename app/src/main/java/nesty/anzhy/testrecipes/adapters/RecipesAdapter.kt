package nesty.anzhy.testrecipes.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import nesty.anzhy.testrecipes.databinding.RecipesItemLayoutBinding
import nesty.anzhy.testrecipes.models.RecipesItem

class RecipesAdapter:RecyclerView.Adapter<RecipesAdapter.VH>() {

    private var recipes = emptyList<RecipesItem>()


    class VH(
        val binding: RecipesItemLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: RecipesItemLayoutBinding =
            RecipesItemLayoutBinding.inflate(inflater, parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val data = recipes[position]
        Log.e("DATASTR$position", data.toString())
        Picasso.get()
            .load(data.images?.get(0))
            .centerCrop()
            .into(holder.binding.ivRecipe)
    }

    override fun getItemCount(): Int = recipes.size

    fun setData(newData: List<RecipesItem>) {
        this.recipes = newData
        notifyDataSetChanged()
    }

}