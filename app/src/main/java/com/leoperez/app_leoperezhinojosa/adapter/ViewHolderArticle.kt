package com.leoperez.app_leoperezhinojosa.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_leoperezhinojosa.models.Article

class ViewHolderArticle (
    view: View,
    var deleteOnClick: (Int) -> Unit
) : RecyclerView.ViewHolder(view) {
    private lateinit var binding : ArticleCardBinding

    init {
        binding = ArticleCardViewBinding.bind(view)
    }

}



