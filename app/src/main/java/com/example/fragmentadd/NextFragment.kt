package com.example.fragmentadd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
class NextFragment : Fragment() {
    private lateinit var nextButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        nextButton = view.findViewById(R.id.next)
        val nextFragment = NextFragment()
        nextButton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, nextFragment)
                ?.commit()
        }

        return view
    }
}
