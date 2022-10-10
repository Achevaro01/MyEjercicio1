package com.example.myejercicio1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.myejercicio1.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("nombre")
        binding.txtNombreLlegada.text = nombre



        binding.btnLlamada.setOnClickListener {
            val telefono = intent.getStringExtra("telefono")
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$telefono"))
            startActivity(intent)
        }

        binding.btnCorreo.setOnClickListener {
            val correo = intent.getStringExtra("correo")
            //val intent = Intent(Intent.ACTION_SEND, Uri.parse("$correo"))
            // startActivity(intent)
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/html"
            intent.putExtra(Intent.EXTRA_EMAIL, "$correo")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.")

            startActivity(Intent.createChooser(intent, "Send Email"))
        }

    }
}