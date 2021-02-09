package com.ynavizovskyi.signuptestapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ynavizovskyi.signuptestapp.R
import com.ynavizovskyi.signuptestapp.presentation.base.BaseFragment
import javax.inject.Inject

class MainFragment : BaseFragment() {

    @Inject
    lateinit var vieModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            vieModel.logOut()
        }
        observeData()
    }

    private fun observeData(){
        vieModel.logOutLiveData.observe(viewLifecycleOwner){
            findNavController().navigate(R.id.action_MainFragment_to_SignInFragment)
        }
        //Ideally we would observe session manager session state, but I don't have time for that ¯\_(ツ)_/¯
    }



}