package com.example.coraline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.coraline.databinding.ItemUserBinding

class UserAdapter(private val users: List<user>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

   private lateinit var context: Context

    //infla "dibuja"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
       //val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context) )
        return ViewHolder(view)
    }

    //asignar
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //val user=users.get(position)
        val user= users[position]

       // with("1"){
          //  length
           // toInt()
       // }
        // agrupacion
        with(holder){
            binding.tvOrde.text= (position+ 1).toString()
            binding.tvname.text=user.name+ " "+ user.lastname
            binding
            Glide.with(context).load(user.url).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().circleCrop().into(binding.imagephoto)
       }

       // holder.bind(
         //   users[position])

    }

    //contar
    override fun getItemCount() = users.count()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val binding=ItemUserBinding.bind(view)
      //  fun bind(user: user) {
          //  view.tvname.text = user.name
        }
    }
