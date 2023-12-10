package com.leoperez.app_leoperezhinojosa.models

class Client(
    var email: String,
    var pass: String,
    var name: String,
    var phone: Int,
    var direction: String) {

    // Propiedad extra: Lista de la compra (Articulos)
    var shopping: MutableList<Article> = mutableListOf()

    // ToString
    override fun toString(): String {
        return "- Cliente: Email: $email, Clave: $pass, Nombre: $name, " +
                "Telefono: $phone, Direccion: $direction " +
                "\n# Cesta: $shopping"
    }
}

