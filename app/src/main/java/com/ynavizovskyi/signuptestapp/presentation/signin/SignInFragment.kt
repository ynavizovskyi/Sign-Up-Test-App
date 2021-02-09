package com.ynavizovskyi.signuptestapp.presentation.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.ynavizovskyi.signuptestapp.R
import com.ynavizovskyi.signuptestapp.presentation.base.BaseFragment
import javax.inject.Inject

class SignInFragment : BaseFragment() {

    @Inject
    lateinit var viewModel: SignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val emailEditText = view.findViewById<EditText>(R.id.edit_text_email)
        val passwordEditText = view.findViewById<EditText>(R.id.edit_text_password)

        view.findViewById<Button>(R.id.button_sign_in).setOnClickListener {
            viewModel.signIn(emailEditText.text.toString(), passwordEditText.text.toString())
        }

        observeData()
    }

    private fun observeData(){
        viewModel.signInLiveData.observe(viewLifecycleOwner){ success ->
            if(success){
                findNavController().navigate(R.id.action_SignInFragment_to_MainFragment)
            }
        }
    }

}