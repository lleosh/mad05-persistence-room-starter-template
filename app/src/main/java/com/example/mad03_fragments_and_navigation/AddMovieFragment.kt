package com.example.mad03_fragments_and_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mad03_fragments_and_navigation.databinding.FragmentAddMovieBinding

class AddMovieFragment : Fragment() {
    lateinit var binding: FragmentAddMovieBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var btnClicked: Int = 0
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_movie, container, false)


        binding.genreChips.setOnCheckedChangeListener { group, checkedId ->

        }

        binding.saveBtn.setOnClickListener {
            btnClicked++
            binding.textView4.text = btnClicked.toString()

        }

        return binding.root
    }
}