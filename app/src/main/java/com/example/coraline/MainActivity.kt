package com.example.coraline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coraline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //instancia del adaptador
    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayourManege: RecyclerView.LayoutManager
    private lateinit var binding: ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding=ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
      //  setContentView(R.layout.activity_main)

    userAdapter=UserAdapter(getUsers())
    linearLayourManege=LinearLayoutManager(this)

    binding


    }

    private fun getUsers(): MutableList<user> {

    }
}