package ibarra.kevin.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class detalle_pelicula : AppCompatActivity() {
    val iv_pelicula_image: ImageView = findViewById(R.id.iv_pelicula_imagen)
    val tv_nombre_pelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
    val tv_pelicula_descripcion: TextView = findViewById(R.id.tv_pelicula_descripcion)

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle=intent.extras
        if (bundle!=null){
            iv_pelicula_image.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_pelicula_descripcion.setText(bundle.getString("sinopsis"))
        }
    }
}