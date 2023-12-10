package com.leoperez.app_leoperezhinojosa.objects_models

import com.leoperez.app_leoperezhinojosa.models.Article

object Articles {

    // Lista de articulos:
    val a1 = Article(
        "a001", "Patatas, 5kg", "Del Chef", 30,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlCo_0sCGJKltIxe--FsDHBauGe4p_s0Yenw&usqp=CAU",
        6.50)
    val a2 = Article(
        "a002", "Leche entera, 1l, 6u", "Covap", 50,
        "https://tienda.covap.es/images/thumbnails/600/600/detailed/9/botella-leche-entera-1,5l.jpg",
        10.50)
    val a3 = Article(
        "a003", "Chocolate 82% Negro", "Valor",
        35, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuVmZpI84EPtXXlvDPrV68Dejmzh7hMH4mng&usqp=CAU",
        4.90)
    val a4 = Article(
        "a004", "Champu, 200ml", "HS classic", 40,
        "https://cdn2.primor.eu/media/catalog/product/cache/8d3aba296f7a18b5251ee30fa5db42b2/0/8/08006540748466_80718481_PRODUCT_IMAGE_IN_PACKAGE_FRONT_CENTER_3000X3000_1_SPANI_d8bd.webp",
        2.70)
    val a5 = Article(
        "a005", "Detergente, 1.5l", "Ariel", 45,
        "https://media.rourejuni.com/c/product/ariel-liq-regular-368-d-520x520.jpg",
        14.50)
    val a6 = Article(
        "a006", "Bombones, 200gr", "Nestle", 20,
        "https://m.media-amazon.com/images/I/71Ut6B37C+L._AC_UF894,1000_QL80_.jpg",
        11.70)
    val a7 = Article(
        "a007", "Vino, 70cl, 6u", "Protos", 10,
        "https://www.vinoseleccion.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/p/r/protos-vs.jpg",
        10.50)
    val a8 = Article(
        "a008", "Lejia, 5l", "Conejo", 65,
        "https://t1.gstatic.com/images?q=tbn:ANd9GcTCx0SPXptqdn1GFrCQy9qIZ3FZJMVRFhhMyQjncR72bkMr-P6p",
        6.90)
    val a9 = Article(
        "a009", "Tomate frito, 370ml", "Hero", 50,
        "https://www.latiendahero.es/media/catalog/product/cache/c618c2928eceaf37dee079899c3658fc/h/e/hero__ficticiotomatefritoreceta_casera__tol_1_2_1.png",
        1.90)
    val a10 = Article(
        "a010", "Pimienta negra, 50gr", "Carmencita", 25,
        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRojrzcP8wEUxZ9Qlcgs8V1la_DWVV_JYM5SKw3MAmRzA0LNo4E",
        2.50)


    val articles : MutableList<Article> = mutableListOf(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)

}