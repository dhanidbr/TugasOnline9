package com.example.tugaspratikum9

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText

class FirstFragment : Fragment(){
    private var communicationViewModel: CommunicationViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel =
            ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setnamewhentextchanged(view.findViewById<TextInputEditText>(R.id.textInputTextName), "Name")

        setnamewhentextchanged(view.findViewById<TextInputEditText>(R.id.textInputTextNpm), "Npm")

        setnamewhentextchanged(view.findViewById<TextInputEditText>(R.id.textInputTextEmail), "Email")

        setnamewhentextchanged(view.findViewById<TextInputEditText>(R.id.textInputTextGithub), "Github")

        setnamewhentextchanged(view.findViewById<TextInputEditText>(R.id.textInputTextGithub), "Web")

    }

    fun setnamewhentextchanged(txtinput: TextInputEditText, type: String) {
        txtinput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                if (type == "Name") {
                    communicationViewModel!!.setName(charSequence.toString())
                } else if (type == "Npm") {
                    communicationViewModel!!.setNpm(charSequence.toString())
                } else if (type == "Email") {
                    communicationViewModel!!.setEmail(charSequence.toString())
                } else if (type == "Github") {
                    communicationViewModel!!.setGithub(charSequence.toString())
                } else if (type == "Web") {
                    communicationViewModel!!.setWeb(charSequence.toString())
                }
            }

            override fun afterTextChanged(editable: Editable) {}
        })
    }

    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }
}