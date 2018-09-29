package bogdan.roatis.check

import android.text.StaticLayout

/**
 *
 * Created by Bogdan Roatis on 29/09/2018.
 */

/**
 * Calculated the widest line in a [StaticLayout].
 */
fun StaticLayout.textWidth(): Int {
    var width = 0f
    for (i in 0 until lineCount) {
        width = width.coerceAtLeast(getLineWidth(i))
    }
    return width.toInt()
}
