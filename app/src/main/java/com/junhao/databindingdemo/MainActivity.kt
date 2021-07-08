package com.junhao.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.junhao.databindingdemo.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var aPerson: Person = Person("ali", "123", "ali@gmail.com", "123 Jalan ABC")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xxx@gmail.com"
            aPerson.address="123 JALAN XYZ"

            binding.apply { invalidateAll() }

        }

        /*
        binding.tvInputName.text = aPerson.name
        binding.tvInputAddress.text = aPerson.address
        binding.tvInputICNo.text = aPerson.ic
        binding.tvInputEmail.text = aPerson.email
*/


    }
}