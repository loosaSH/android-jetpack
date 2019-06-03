package net.loosash.databindinganalysis

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel


class DataBindingViewModel : ViewModel() {
    private val _name: MutableLiveData<String> by lazy { MutableLiveData<String>().also { it.value = "Ada" } }
    private val _lastName: MutableLiveData<String> by lazy { MutableLiveData<String>().also { it.value = "Lovelace" } }
    private val _submit: MutableLiveData<Int> by lazy { MutableLiveData<Int>().also { it.value = 0 } }

    val name: LiveData<String> = _name
    val lastName: LiveData<String> = _lastName
    val times: LiveData<Int> = _submit


    fun onSubmit() {
        _submit.value = (_submit.value ?: 0) + 1
    }
}
