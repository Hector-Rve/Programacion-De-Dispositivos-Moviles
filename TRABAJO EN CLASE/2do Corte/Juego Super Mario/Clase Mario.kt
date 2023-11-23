class Mario(var vidas: Int = 3) {
    init {
        println("It's me Mario") // se presenta al construirlo
    }

    private var state = "small"
        set(value) {
            field = when (value) {
                "Super mario", "fire mario", "star" -> value
                else -> "small"
            }
        }

    private var lives = 3
        set(value) {
            if (field == 1) {
                field = 0
                gameOver()
            } else if (field == 0) {
                println("Necesitas volver a jugar")
            } else {
                field = value
            }
        }

    private fun die() { // setter
        lives--
        println("Has perdido una vida ")
    }

    fun collision(collisionObj: String) {
        when (collisionObj) {
            "Goomba" -> die()
            "super mushroom" -> state = "Super mario"
            "Fire flower" -> state = "fire mario"
            "star" -> state = "star"
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }

    fun getLives(): String {
        return "$lives vidas"
    }

    private fun gameOver() {
        println("Juego TERMINADO")
    }
}
