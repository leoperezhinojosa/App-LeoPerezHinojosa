package com.leoperez.app_leoperezhinojosa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.leoperez.app_leoperezhinojosa.controller.Controller
import com.leoperez.app_leoperezhinojosa.models.Article
import com.leoperez.app_leoperezhinojosa.objects_models.Articles

class UserActivity : AppCompatActivity() {

    private lateinit var controller: Controller
    private var articles : MutableList<Article>
    lateinit var binding : UserActivityBinding
    private lateinit var adapter : ArrayAdapter<Article>

    init {
        articles = Articles.articles.toMutableList()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserActivityBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_user)
    }
}