package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.myfirstapp.constances.Constance
import com.example.myfirstapp.databinding.ActivitySigninupBinding

class SignInUpActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivitySigninupBinding
    private var signState = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySigninupBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
        if(signState == Constance.SIGN_IN_STATE) {
            bindingClass.ptName.visibility = View.GONE
            bindingClass.ptSurname.visibility = View.GONE
            bindingClass.ptMiddleName.visibility = View.GONE
            bindingClass.buttonAvatar.visibility = View.INVISIBLE
        }
    }

    fun onClickDone(view : View) {
        if (signState == Constance.SIGN_UP_STATE) {
            val intent = Intent()
            intent.putExtra(Constance.LOGIN, bindingClass.ptLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.ptPassword.text.toString())
            intent.putExtra(Constance.NAME, bindingClass.ptName.text.toString())
            intent.putExtra(Constance.SURNAME, bindingClass.ptSurname.text.toString())
            intent.putExtra(Constance.MIDDLE_NAME, bindingClass.ptMiddleName.text.toString())
            if(bindingClass.ivAvatarLogin.isVisible) intent.putExtra(Constance.AVATAR, R.drawable.ceo)
            setResult(RESULT_OK, intent)
            finish()
        }
        else if(signState == Constance.SIGN_IN_STATE) {
            intent.putExtra(Constance.LOGIN, bindingClass.ptLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.ptPassword.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    fun onClickAvatar(view : View) {
        bindingClass.ivAvatarLogin.visibility = View.VISIBLE
    }
}