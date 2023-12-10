package com.leoperez.app_leoperezhinojosa.models

class Article (
    // Atributos
    var ref: String,
    var name: String,
    var trademark: String,
    var stock: Int,
    var image: String,
    var price: Double
) {
    // ToString
    override fun toString(): String {
        return "-'$name' (Rf: $ref), Marca: '$trademark', Cantidad: $stock, " +
                ", Precio: $price €, Imagen: '$image'"
    }
}
