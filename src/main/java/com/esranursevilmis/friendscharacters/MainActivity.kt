package com.esranursevilmis.friendscharacters

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.esranursevilmis.friendscharacters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var chList:ArrayList<Friends>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        chList=ArrayList<Friends>()

  val chandler= Friends("Chandler Bing","Statistical Analysis and Data Reconfiguration",R.drawable.chandler)
  val joey= Friends("Joey Tribbiani","Actor",R.drawable.joey)
  val monica= Friends("Monica Geller","Chef",R.drawable.monica)
  val phoebe= Friends("Phoebe Buffay","Masseuse/Musician",R.drawable.phoebe)
  val rachel= Friends("Rachel Green","Fashion Executive",R.drawable.rachel)
  val ross= Friends("Ross Geller","Paleontologist",R.drawable.ross)



        chList.add(chandler)
        chList.add(joey)
        chList.add(monica)
        chList.add(phoebe)
        chList.add(rachel)
        chList.add(ross)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val friendsAdapter=FriendsAdapter(chList)
        binding.recyclerView.adapter=friendsAdapter
    }
}