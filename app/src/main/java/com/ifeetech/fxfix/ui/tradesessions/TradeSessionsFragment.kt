package com.ifeetech.fxfix.ui.tradesessions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ifeetech.fxfix.databinding.FragmentTradeSessionsBinding

class TradeSessionsFragment : Fragment() {


    private val model: TradeSessionsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentTradeSessionsBinding.inflate(inflater, container, false)


        binding.homeViewModel = model

        binding.lifecycleOwner = this



        return binding.root
    }
}