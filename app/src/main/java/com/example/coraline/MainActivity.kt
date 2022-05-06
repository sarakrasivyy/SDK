package com.example.coraline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coraline.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {


    //instancia del adaptador
    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManege: RecyclerView.LayoutManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //  setContentView(R.layout.activity_main)

        userAdapter = UserAdapter(getUsers())
        linearLayoutManege = LinearLayoutManager(this)


    binding.recycle.apply {
        layoutManager=linearLayoutManege
        adapter=userAdapter
    }

    }

    private fun getUsers(): MutableList<user> {
        val users = mutableListOf<user>()

        val x1 = user(1, "sara", "blanco", "https://rockcontent.com/es/wp-content/uploads/sites/3/2019/02/foto-de-perfil-para-instagram.png")
        val x4 = user(1, "sara", "blanco", "https://rockcontent.com/es/wp-content/uploads/sites/3/2019/02/foto-de-perfil-para-instagram.png")
        val x2 = user(2, "luis", "flores", "https://dthezntil550i.cloudfront.net/f4/latest/f41908291942413280009640715/1280_960/1b2d9510-d66d-43a2-971a-cfcbb600e7fe.png")
        val x3 = user(3, "camila", "dass", "https://ayvisa.es/wp-content/uploads/2021/02/descargar-foto-perfil-instagram.jpg")
        val x5 = user(3, "camila", "dass", "https://ayvisa.es/wp-content/uploads/2021/02/descargar-foto-perfil-instagram.jpg")
        val x6 = user(3, "camila", "dass", "https://ayvisa.es/wp-content/uploads/2021/02/descargar-foto-perfil-instagram.jpg")
        val x7 = user(3, "camila", "dass", "https://ayvisa.es/wp-content/uploads/2021/02/descargar-foto-perfil-instagram.jpg")

        users.add(x1)
        users.add(x2)
        users.add(x3)
        users.add(x4)
        users.add(x5)
        users.add(x6)
        users.add(x7)
        return users
    }
    }
