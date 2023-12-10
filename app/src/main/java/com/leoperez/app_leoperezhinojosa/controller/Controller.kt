package com.leoperez.app_leoperezhinojosa.controller

import android.content.Context
import com.leoperez.app_leoperezhinojosa.dao.DaoArticles
import com.leoperez.app_leoperezhinojosa.models.Article

// Clase controlador
class Controller (private val context: Context) {
    private lateinit var adapter: AdapterArticles
    private lateinit var articles: MutableList<Article>

    init {
        dataInit()
    }

    // Iniciar la lista extraida de la clase DaoArticles
    private fun dataInit() {
        articles = DaoArticles.daoArt.getDataArticles().toMutableList()
    }




}