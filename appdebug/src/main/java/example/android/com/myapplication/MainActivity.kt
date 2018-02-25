package example.android.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val util = Util()
        // The facebook page URL
        val url = "fb://page/218641444910278"
        // Onclick of the first button
        fbButton.setOnClickListener({
            util.openFacebookPage(this, url)
        })
        // Onclick of the second button
        factButton.setOnClickListener({
            val s = factEditText.text.toString()
            if (s != "") {
                try {
                    val i = util.factorial(factEditText.text.toString().toInt())

                    toast("Le factoriel est: $i")
                } catch (e: Exception) {
                    toast("Veuillez entrer un nombre et non pas autre chose ")
                }
            } else toast("Veuillez remplir le champ")


        })
        // Onclick of the third button
        avgButton.setOnClickListener({
            try {
                val list = util.randomList(sizeEditText.text.toString().toInt())
                var sum = 0
                for (item in list) {
                    sum += item
                }
                toast("La moyenne de la liste est: ${sum / list.size}")
            } catch (e: ArithmeticException) { //division par zeroo
                toast("0 n'est pas une valeur valide ")
            } catch (e: NumberFormatException) { //vide n'est pas traduit en int
                toast("Veuillez remplir le champs ")
            } catch (e :Exception){
                toast("other errors")
            }
        })


    }
}

