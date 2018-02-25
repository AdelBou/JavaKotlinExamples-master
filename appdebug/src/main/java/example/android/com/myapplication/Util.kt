package example.android.com.myapplication

import android.content.Context
import android.content.Intent
import android.net.Uri
import org.jetbrains.anko.browse

/**
 * Created by hakim on 2/22/18.
 */
class Util {

    /**
     * This function opens a facebook url using facebook app
     */

    fun openFacebookPage(ctx: Context, facebookUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
        ctx.startActivity(intent)
    }

    /**
     * This function opens a web page
     */

    fun browseUrl(ctx:Context,url:String){
       ctx.browse(url)
    }

    /**
     * This function computes the factorial of a given number
     */
    fun factorial(n: Int): Long {
        if (n == 1) {
            return n.toLong()
        } else {
            return n * factorial(n - 1)
        }
    }

    /**
     * This function generates a random list of Integer
     */

    fun randomList(size: Int): List<Int> {
        val list = mutableListOf<Int>()
        for (i in 0..size - 1) {
            list.add(random(10000))
        }
        return list
    }

    /**
     * This function returns a random number less than n
     */
    fun random(n: Int) = (Math.random() * n).toInt()
}