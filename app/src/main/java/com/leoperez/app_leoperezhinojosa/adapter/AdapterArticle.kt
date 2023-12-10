package com.leoperez.app_leoperezhinojosa.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_leoperezhinojosa.models.Article

class AdapterArticle (
    private var articles: MutableList<Article>,
    private var deleteOnClick: (Int) -> Unit
) : RecyclerView.Adapter<viewHolderArticle>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolderArticle {
        val layoutInflater = LayoutInflater.from(parent.context)
        val layoutArticle = R.layout.article_card
        return ViewHolderArticle(
            layoutInflater.inflate(layoutArticle, parent, false),
            deleteOnClick
        )
    }

    // Contador de articulos:
    override fun getItemCount(): Int = articles.size

    override fun onBindViewHolder(holder: viewHolderArticle, position: Int) {
        holder.renderize(articles[position], position)
    }
}