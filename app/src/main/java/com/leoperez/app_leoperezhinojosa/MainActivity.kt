package com.leoperez.app_leoperezhinojosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.leoperez.app_leoperezhinojosa.models.Article
import com.leoperez.app_leoperezhinojosa.models.Client

class MainActivity : AppCompatActivity() {

    // LOGIN:
    // Lista de clientes:
    private val c1 = Client("leo.com", "1234","Leo", 666333000, "P/Estacion, 7, Jaen")
    private val c2 = Client("santi.com", "1234","Santi", 666444555, "A/Madrid, 40, Jaen")
    private val c3 = Client("alicia.com", "1234","Maria", 666777888, ",C/Nueva, 35, Jaen")
    private val c4 = Client("jose.com", "1234","Manuel", 666111333, ",C/Real, 2, Jaen")
    private val c5 = Client("joaquin.com", "1234","Joaquin", 666888222, "A/Andalucia, 66, Jaen")
    private val clients : List<Client> = listOf(c1, c2, c3, c4, c5)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Conexión a la interfaz de usuario:
        val buttonLogin:Button = findViewById(R.id.buttonLogin)
        val insertEmail:EditText = findViewById(R.id.insertEmail)
        val insertPass:EditText = findViewById(R.id.insertPass)

        // Configuración del botón de Login:
        buttonLogin.setOnClickListener(View.OnClickListener {

            // Obtener datos de Usuario/Clave:
            val email = insertEmail.text.toString()
            val pass = insertPass.text.toString()

            // Verificación de Login:
            if (login(email, pass) != null) {
                val intent = Intent(this@MainActivity, UserActivity::class.java)
                startActivity(intent)
            } else {
                // Informe de datos inexistentes
                Toast.makeText(
                    this@MainActivity,
                    "Usuario y/o Clave incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }

    // Funcion Login
    private fun login(email: String, pass: String): Client? {
        for (client in clients) {
            if ((client.email == email) && (client.pass == pass))
                return client
        }
        return null
    }

}