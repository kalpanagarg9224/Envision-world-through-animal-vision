package com.kalpana.animalVision.fragment

import android.content.Context
import android.view.*
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment(val c: Context) : Fragment() {


    lateinit var recyclerView: RecyclerView

    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var editTextSearch: EditText
    lateinit var radioButtonView: View
    lateinit var unableSearch: RelativeLayout
    lateinit var prog: ImageView

}