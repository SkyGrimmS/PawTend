package com.example.pawtend.funFeature.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.pawtend.funFeature.presentation.FunViewModel
import com.example.pawtend.R

class FunFragment : Fragment() {

    companion object {
        fun newInstance() = FunFragment()
    }

    private val viewModel: FunViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return inflater.inflate(R.layout.fragment_fun, container, false)
    }
}