package com.example.coraline

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coraline.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputEditText

class MainActivity: AppCompatActivity(), Clicheck {


    //instancia del adaptador
    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManege: RecyclerView.LayoutManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //  setContentView(R.layout.activity_main)

        // almacenamiento de pequeñas cantidades
        val preferences=getPreferences(Context.MODE_PRIVATE)

        //traer los datos con valor boolean
        //                                     nombre de la variable
        val isFirstTime=preferences.getBoolean(getString(R.string.sp_firt_time), true)

        //imprimir mensage
        Log.i("SP", "${getString(R.string.sp_firt_time)}= $isFirstTime")

         // insertar datos y verifiacion
        if(isFirstTime){

            // inflar informacion
            val dialogview=layoutInflater.inflate(R.layout.dalogo_registro, null)
            MaterialAlertDialogBuilder(this)
                .setTitle(R.string.dialogo_user)
                .setView(dialogview)
                    // no cancelar
                .setCancelable(false)
                .setPositiveButton(R.string.messagetrue, { dialogInterface, i ->
                    val username=dialogview.findViewById<TextInputEditText>(R.id.tiusername).text.toString()


            // funcion de alcanse
            with(preferences.edit()){
                putBoolean(getString(R.string.sp_firt_time), false)
                putString(getString(R.string.sp_username), username).apply()
            }
        }).show()
    }

        userAdapter = UserAdapter(getUsers(), this)
        linearLayoutManege = LinearLayoutManager(this)

        binding.recycle.apply {
        setHasFixedSize(true)
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
    override fun clicheck(user: user, position: Int) {
        Toast.makeText(this,"$position ${user.getfullName() }", Toast.LENGTH_SHORT).show()
    }
    }

