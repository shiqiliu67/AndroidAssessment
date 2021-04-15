package com.shiqiliu.andoridassessment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shiqiliu.andoridassessment.R
import com.shiqiliu.andoridassessment.module.Employee
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_login.view.*

private const val employee = "Employee"
class HomeFragment : Fragment() {

    private var employee: Employee? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            employee = it.getSerializable(Employee.KEY_Employee) as Employee
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_home, container, false)
        view.text_view_id.text= employee!!.id
        view.text_view_name.text=employee!!.name
        view.text_view_email.text=employee!!.email
        view.text_view_gender.text=employee!!.gender
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(employee: Employee) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                   putSerializable(Employee.KEY_Employee,employee)
                }
            }
    }
}