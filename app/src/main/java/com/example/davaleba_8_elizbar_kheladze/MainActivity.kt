package com.example.davaleba_8_elizbar_kheladze

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.example.davaleba_8_elizbar_kheladze.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)

        var imageId = intArrayOf(R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5)
        var name = arrayOf("jemali", "giorgi", "zviadi", "merabi", "natruli")
        var email = arrayOf("jemali@123.com", "giorgi@123.com", "zviadi@123.com", "merabi@123.com", "natruli@123.com")
        var phNum = arrayOf("574922966", "574896935", "574555888", "579335687", "568683893")
        var country = arrayOf("Georgia", "Finland", "Ukraine", "United Kingdom", "Bhutan")

        var userArrayList = ArrayList<User>()

        var i = 0
        while (i < imageId.count()) {
            val user = User(name[i], email[i], phNum[i], country[i], imageId[i])
            userArrayList.add(user)
            i = i + 1
        }
        binding.listView.setAdapter(adapter)
        binding.listView.setClickable(true)
        binding.listView.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            val i = Intent(this@MainActivity, UserActivity::class.java)
            i.putExtra("name", name[position])
            i.putExtra("phone", phNum.get(position))
            i.putExtra("country", country[position])
            i.putExtra("imageid", imageId[position])
            startActivity(i)
        })
    }
}


