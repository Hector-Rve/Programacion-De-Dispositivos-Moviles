package P3.Operadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main () {
    val y2 = -2f
    val y1 = 3f
    val x2 = -3f
    val x1 = 4f
    val m = (y2 - y1)/(x2 - x1)
    println(m)
}