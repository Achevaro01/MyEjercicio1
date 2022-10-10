package com.example.myejercicio1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.snackbar.Snackbar
import androidx.core.app.ActivityCompat.startActivityForResult

import android.content.Intent
import com.example.myejercicio1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cuadroUno.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            val foto: String = binding.imageView.toString()
            intent.putExtra("foto",foto)

            val nombre: String = binding.txtNombre.text.toString()
            intent.putExtra("nombre",nombre)

            val telefono: String = binding.txtTelefono.text.toString()
            intent.putExtra("telefono",telefono)

            val correo: String = binding.txtGmail.text.toString()
            intent.putExtra("correo",correo)

            startActivityForResult(intent,0)
        }
        binding.cuadroDos.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            val nombre: String = binding.txtNombre2.text.toString()
            intent.putExtra("nombre",nombre)

            val telefono: String = binding.txtTelefono2.text.toString()
            intent.putExtra("telefono",telefono)

            val correo: String = binding.txtGmail2.text.toString()
            intent.putExtra("correo",correo)

            startActivityForResult(intent,0)
        }
        binding.cuadroTres.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            val nombre: String = binding.txtNombre3.text.toString()
            intent.putExtra("nombre",nombre)

            val telefono: String = binding.txtTelefono3.text.toString()
            intent.putExtra("telefono",telefono)

            val correo: String = binding.txtGmail3.text.toString()
            intent.putExtra("correo",correo)

            startActivityForResult(intent,0)
        }
    }

}