package com.example.tugaspratikum9

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mNPM = MutableLiveData<String>()
    private val mEmail = MutableLiveData<String>()
    private val mGithub = MutableLiveData<String>()
    private val mWeb = MutableLiveData<String>()
    val name: LiveData<String> get() = mName
    val npm: LiveData<String> get() = mNPM
    val email: LiveData<String> get() = mEmail
    val github: LiveData<String> get() = mGithub
    val web: LiveData<String> get() = mWeb

    fun setName(name: String) {
        mName.value = name
    }
    fun setNpm(npm: String){
        mNPM.value = npm
    }
    fun setEmail(email: String){
        mEmail.value = email
    }
    fun setGithub(github: String){
        mGithub.value = github
    }
    fun setWeb(web: String) {
        mWeb.value = web
    }
}