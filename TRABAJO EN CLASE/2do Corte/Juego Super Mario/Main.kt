fun main() {
    val mario = Mario()

    mario.collision("pipe")
    mario.collision("goomba")

    for (i in 1..5) {
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")
    }

    /*
    if (mario.isAlive) {
        mario.collision("Goomba") // Corregí el typo en "Gooma" a "Goomba"
        println("Te quedan ${mario.getLives()}")
    }*/

}
