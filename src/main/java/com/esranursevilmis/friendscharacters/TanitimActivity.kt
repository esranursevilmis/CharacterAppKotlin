package com.esranursevilmis.friendscharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.esranursevilmis.friendscharacters.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val friends = intent.getSerializableExtra("friends") as Friends
        binding.nameText.text = "Character Name: ${friends.name}"
        binding.jobText.text = "Job: ${friends.job}"
        binding.imageView.setImageResource(friends.image)

        /*
        val selectedLandmark = MySingleton.selectedLandmark
        if(selectedLandmark != null) {
            binding.imageView.setImageResource(selectedLandmark.image)
            binding.nameText.text = selectedLandmark.name
            binding.countryText.text = selectedLandmark.country
        }

         */

    }
    }
