package smart.com.smdev.magic

import android.view.View
import smart.com.smdev.magic.internal.MagicAnimation

/**
 * Created by bloder on 20/09/16.
 */
fun doWith(view : View) {
    var animation : MagicAnimation
    animation = MagicAnimation(view)
    animation.duration = 500
    view.startAnimation(animation)
}