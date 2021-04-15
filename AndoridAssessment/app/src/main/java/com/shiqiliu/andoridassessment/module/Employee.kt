package com.shiqiliu.andoridassessment.module

import java.io.Serializable

data class Employee(
    var id :String,
    var name :String,
    var email:String,
    var gender:String
): Serializable {
    companion object{
        const val KEY_Employee = "Employee"
    }
}