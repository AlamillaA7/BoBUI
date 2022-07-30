package com.zybooks.bobfragmentui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FeatureFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_feature, container, false)

        val button = view.findViewById<Button>(R.id.backtohomeBtn)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_featureFragment_to_homeFragment)
        }


        val button2 = view.findViewById<Button>(R.id.bluetoothNavbtn)
        button2.setOnClickListener{
            findNavController().navigate(R.id.action_featureFragment_to_bluetoothFragment2)
        }


        return view

    }

}