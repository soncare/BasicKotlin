fun main() {
    var nombre: String? = null
    println(nombre?.length)
    try {
        nombre!!.length
    } catch (excepcion: NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error.... Cerrando aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado = try { primerValor / segundoValor } catch (excepcion: Exception) { 0 }
    println(resultado)
}