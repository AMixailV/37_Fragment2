package ru.mixail_akulov.a37_fragment2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.mixail_akulov.a37_fragment2.R
import ru.mixail_akulov.a37_fragment2.contract.HasCustomTitle
import ru.mixail_akulov.a37_fragment2.contract.navigator
import ru.mixail_akulov.a37_fragment2.databinding.FragmentBoxBinding

class BoxFragment : Fragment(), HasCustomTitle {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragmentBoxBinding.inflate(inflater, container, false).apply {
        toMainMenuButton.setOnClickListener { onToMainMenuPressed() }
    }.root

    private fun onToMainMenuPressed() {
        navigator().goToMenu()
    }

    override fun getTitleRes(): Int = R.string.box

}