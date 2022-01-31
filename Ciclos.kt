fun main() {
    var contador = 10
    while (contador > 0){
        println("El valor del contador es $contador")
        contador--
    }

    do {
        println("Generando numero aleatorio")
        val numeroAleatorio = (0..100).random()
        println("El numero genarado es $numeroAleatorio")
    }while (numeroAleatorio > 50)

    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    for (fruta in listaDeFrutas){
        println("Hoy voy a comerme una fruta llamada $fruta")
    }

    listaDeFrutas.forEach { fruta -> println("Hoy voy a comerme una fruta nueva llamada $fruta") }

    val caracteresDeFruta = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { fruta -> fruta > 5 }
    println(listaFiltrada)
}