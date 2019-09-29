package com.example.biodata

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAlamat:Button=findViewById(R.id.btn_alamat)
        btnAlamat.setOnClickListener(this)
        val btnTelfon:Button=findViewById(R.id.btn_telfon)
        btnTelfon.setOnClickListener(this)
        val btnEmail:Button=findViewById(R.id.btn_email)
        btnEmail.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_alamat -> {
                val alamat = "-6.979118, 110.409979"
                val mapsIntent=Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=$alamat"))
                    startActivity(mapsIntent)
            }
            R.id.btn_telfon->{
                val notelp = "085741444628"
                val telfonIntent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:$notelp"))
                startActivity(telfonIntent)
            }
            R.id.btn_email->{
                val email ="111201710070@mhs.dinus.ac.id"
                val emailIntent=Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
                startActivity(emailIntent)
            }
        }
    }
}
