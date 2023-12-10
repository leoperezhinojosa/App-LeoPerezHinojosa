package com.leoperez.app_leoperezhinojosa.interfaces

import com.leoperez.app_leoperezhinojosa.models.Article
import com.leoperez.app_leoperezhinojosa.objects_models.Articles

interface DaoArticlesInterface {
    fun getDataArticles(): List<Article> = Articles.articles
}