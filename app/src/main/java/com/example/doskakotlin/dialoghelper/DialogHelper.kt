package com.example.doskakotlin.dialoghelper

import android.app.AlertDialog
import com.example.doskakotlin.MainActivity
import com.example.doskakotlin.R
import com.example.doskakotlin.databinding.SignDialogBinding

class DialogHelper(act:MainActivity) {
    private val act1 = act

    fun createSignDialog(index:Int) {
        val builder = AlertDialog.Builder(act1)
        val rootDialogElement = SignDialogBinding.inflate(act1.layoutInflater)

        val view = rootDialogElement.root
        if (index == DialogConst.SIGN_UP_STATE)
        {
            rootDialogElement.tvSignTitle.text = act1.resources.getString(R.string.ad_sign_up)
            rootDialogElement.btnSignUpIn.text = act1.resources.getString(R.string.sign_up_action)
        }
        else
        {
            rootDialogElement.tvSignTitle.text = act1.resources.getString(R.string.ad_sign_in)
            rootDialogElement.btnSignUpIn.text = act1.resources.getString(R.string.sign_in_action)

        }
        builder.setView(view)
        builder.show()

    }
}