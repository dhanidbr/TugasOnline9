package com.example.tugaspratikum9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.tugaspratikum9.CommunicationViewModel
import com.example.tugaspratikum9.R

class SecondFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null
    private var txtNpm: TextView? = null
    private var txtEmail: TextView? = null
    private var txtGithub: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel =
            ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_second,
            container, false
        )
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewNama)
        communicationViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })

        super.onViewCreated(view, savedInstanceState)
        txtNpm = view.findViewById(R.id.textViewNpm)
        communicationViewModel!!.npm.observe(requireActivity(),
            Observer { s -> txtNpm!!.text = s })

        super.onViewCreated(view, savedInstanceState)
        txtEmail = view.findViewById(R.id.textViewEmail)
        communicationViewModel!!.email.observe(requireActivity(),
            Observer { s -> txtEmail!!.text = s })

        super.onViewCreated(view, savedInstanceState)
        txtGithub = view.findViewById(R.id.textViewGithub)
        communicationViewModel!!.github.observe(requireActivity(),
            Observer { s -> txtGithub!!.text = s })
    }
    companion object {
        fun newInstance(): SecondFragment {
            return SecondFragment()
        }
    }
}