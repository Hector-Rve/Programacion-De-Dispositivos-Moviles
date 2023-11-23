open class Enemy(val name: String, val strength: Int ) { //open es para que pueda ser sobreescrito
    protected var direction : String  = "LEFT"

    protected fun changeDirection(){
        direction = if (direction == "RIGHT") "LEFT" else "RIGHT"
        println("$name va en direccion  $direction")

    }
    protected fun die(){ //indicamos al jugador que nuestro enemigo ha muerto
        println("$name ha muerto")
    }

    open fun collision(collider: String){ //decidir qué acción ejecutar dependiendo del objeto con que se ccolisiona
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}
