fun main() {
    val nombre : String = "Carlos"

    //Asi se hacen los if de manera tradicional
    if (nombre.isNotEmpty()){
        println("Mi nombre es $nombre")
        println("La cantidad de caracteres de mi nombre es ${nombre.length}")
    }else{
        println("La variable nombre se encuentra vacia")
    }

    //Asi se hacen cuando lo queremos hacer en una sola linea
    if (nombre.isNotEmpty()) println("Mi nombre es $nombre") else println("La variable nombre se encuentra vacia")

    val mensaje : String = if (nombre.length > 4){
        "Tu nombre es largo"
    }else{
        "Tu nombre es corto"
    }
    println(mensaje)
}