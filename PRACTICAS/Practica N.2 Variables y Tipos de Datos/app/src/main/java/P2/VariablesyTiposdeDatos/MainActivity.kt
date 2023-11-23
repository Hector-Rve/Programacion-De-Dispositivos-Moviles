package P2.VariablesyTiposdeDatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

const val PI = 3.1416
fun main() {
    val decimal = 1.325f
    val perimetro = 2*PI*decimal
    println("El perimetro del circulo es: $perimetro")
}