package com.shiqiliu.andoridassessment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shiqiliu.andoridassessment.R
import com.shiqiliu.andoridassessment.module.Employee
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_login, container, false)
        view.button_send_data.setOnClickListener {
            var id = view.edit_text_id.text.toString()
            var name = view.edit_text_name.text.toString()
            var email = view.edit_text_email.text.toString()
            var gender = view.edit_text_gender.text.toString()
            var employee= Employee(id,name,email,gender)
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                HomeFragment.newInstance(employee)).commit()}
        return view
    }

//    private fun init(view: View?) {
//        view.button_send_data.setOnClickListener {
//            var id = edit_text_id.text.toString()
//            var name = edit_text_name.text.toString()
//            var email = edit_text_email.text.toString()
//            var gender = edit_text_gender.text.toString()
//            var employee= Employee(id,name,email,gender)
//            activity!!.supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
//                HomeFragment.newInstance(employee)).commit()
//
//        }
//    }

}


