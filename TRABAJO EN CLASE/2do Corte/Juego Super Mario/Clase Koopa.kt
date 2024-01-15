class Koopa : Enemy("Koopa", 2) {

    override fun collision(collider: String) {
        super.collision(collider) // Mandar a llamar el método collision de la clase padre (Enemy)
        println("Usando la colisión de la clase Enemy")
    }

    /*
    override fun collision(collider: String) {
        when (collider) {
            "weapon" -> {
                state = "shell"
                println("El estado es ahora $state")
            }

            "Enemy" -> changeDirection()
        }
    }
    */
}
