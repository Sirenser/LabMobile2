package com.example.labmobile.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.labmobile.R
import com.example.labmobile.adapter.ListContainerAdapter
import com.example.labmobile.databinding.FragmentListBinding


class ListFragment : Fragment(R.layout.fragment_list) {

    private var binding: FragmentListBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentListBinding.bind(view)

        val adapter = ListContainerAdapter(this)

        binding!!.vpFragmentList.adapter = adapter

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}