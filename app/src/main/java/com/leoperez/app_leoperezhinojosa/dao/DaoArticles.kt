package com.leoperez.app_leoperezhinojosa.dao

import com.leoperez.app_leoperezhinojosa.interfaces.DaoArticlesInterface
import com.leoperez.app_leoperezhinojosa.models.Article
import com.leoperez.app_leoperezhinojosa.objects_models.Articles

class DaoArticles private constructor() : DaoArticlesInterface {
    companion object {
        val daoArt: DaoArticles by lazy {
            DaoArticles()
        }
    }

    override fun getDataArticles(): List<Article> = Articles.articles
}

