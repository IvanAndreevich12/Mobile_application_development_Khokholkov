package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data.RepositoryImpl
import com.example.domain.Repository
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val repository: Repository = RepositoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = repository.getData()
        val adapter = ProductAdapter(data)
//        binding.button2.setOnClickListener {
//            startActivity(MainActivity2.createIntent(this))
//        }
        binding.recyclerViewProducts.adapter = adapter
        binding.recyclerViewProducts.layoutManager = LinearLayoutManager(this)
    }

//    companion object {
//        fun createIntent2(fromContext: Context): Intent {
//            return Intent(fromContext, MainActivity::class.java)
//        }
//    }
}