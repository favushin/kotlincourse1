package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import com.example.myfirstapp.constances.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    private var login : String = "empty"
    private var password : String = "empty"
    private var name : String = "empty"
    private var surname: String = "empty"
    private var middleName : String = "empty"
    private var imageAvatar : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == Constance.REQUEST_CODE_SIGN_IN) {
            val l = data?.getStringExtra(Constance.LOGIN)
            val p = data?.getStringExtra(Constance.PASSWORD)
            if(login == l && password == p) {
                bindingClass.ivAvatar.visibility = View.VISIBLE
                bindingClass.ivAvatar.setImageResource(imageAvatar)
                val textInfo = "$name $surname $middleName"
                bindingClass.tvInfo.text = textInfo
                bindingClass.buttonExit.text = "Exit"
                bindingClass.buttonGone.visibility = View.GONE
            }
            else {
                bindingClass.ivAvatar.visibility = View.VISIBLE
                bindingClass.ivAvatar.setImageResource(R.drawable.x)
                bindingClass.tvInfo.text = "An account does not exist!"
            }
        }
        else if(requestCode == Constance.REQUEST_CODE_SIGN_UP) {
            login = data?.getStringExtra(Constance.LOGIN)!!
            password = data.getStringExtra(Constance.PASSWORD)!!
            name = data.getStringExtra(Constance.NAME)!!
            surname = data.getStringExtra(Constance.SURNAME)!!
            middleName = data.getStringExtra(Constance.MIDDLE_NAME)!!
            imageAvatar = data.getIntExtra(Constance.AVATAR, 0)
            bindingClass.ivAvatar.visibility = View.VISIBLE
            bindingClass.ivAvatar.setImageResource(imageAvatar)
            val textInfo = "$name $surname $middleName"
            bindingClass.tvInfo.text = textInfo
            bindingClass.buttonExit.text = "Exit"
            bindingClass.buttonGone.visibility = View.GONE
        }
    }

    fun onClickSignIn(view : View) {
        if(bindingClass.ivAvatar.isVisible && bindingClass.tvInfo.text.toString() != "An account does not exist!") {
            bindingClass.ivAvatar.visibility = View.INVISIBLE
            bindingClass.tvInfo.text = ""
            bindingClass.buttonExit.text = getString(R.string.sign_in)
            bindingClass.buttonGone.visibility = View.VISIBLE
        }
        else {
            val intent = Intent(this, SignInUpActivity::class.java)
            intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
        }
    }

    fun onClickSignUp(view : View) {
        val intent = Intent(this, SignInUpActivity::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
    }
}