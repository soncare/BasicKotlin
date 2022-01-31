fun main() {
    val nombreColor = "Carmesi"
    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color de la alegria")
        "Rojo","Carmesi" -> println("El rojo es el color del chavizmo")
        else -> println("No tenemos un mensaje para el color indicado")
    }

    val code = 7450
    when(code){
        in 7400..7440 -> println("Codigo entre los parametros adecuados")
        in 7441..7500 -> println("Codigo por encima de los parametros adecuados")
        else -> println("Codigo desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 41
    val mensaje = when(tallaDeZapatos){
        41,43 -> "Tenemos disponibles"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento no tenemos disponibles"
        else -> "Estos zapatos solo se encuentran en la tallas del 41 al 45"
    }
    println(mensaje)
}