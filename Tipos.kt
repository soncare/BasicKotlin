fun main() {
    val integer : Int = 15
    val boolean : Boolean = true
    val double : Double = 2.7182
    val float : Float = 1.1F
    val long : Long = 3L

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor)
    println(tercerValor)

    val apellido : String = "Repillosa"
    val nombre : String = "Carlos"

    //Forma tradicional de concatenar texto en kotlin
    println(apellido + nombre)
    //Esta es otra forma de concatenar texto en kotlin
    println("Mi nombre es $apellido $nombre")
}