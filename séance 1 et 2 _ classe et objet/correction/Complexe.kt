import kotlin.math.PI
import kotlin.math.atan
import kotlin.math.round
import kotlin.math.sqrt

class Complexe(val reel: Double = 0.0, val im: Double = 0.0) {

    constructor(c: Complexe) : this(c.reel, c.im)

    fun module(): Double = sqrt(reel * reel + im * im)

    fun argument(): Double =
        if (reel == 0.0)
            if (im >= 0) PI / 2 else -PI / 2
        else atan(im / reel)

    fun add(z:Complexe): Complexe =Complexe(reel+z.reel, im+ z.im)

    fun mul(z:Complexe): Complexe = Complexe(reel*z.reel - im*z.im,reel*z.im + im*z.reel)

    /**
     * puissance
     * précondition n >=1
     * @param n, puissance
     * @return puissance (Complexe)
     */
    fun puissance(n:Int):Complexe {
      var r:Complexe=this
      for (i in 2..n) r=mul(r)
      return Complexe(round(r.reel), round(r.im))
    }


    fun puissanceBis(n: Int): Complexe {
        var r = Complexe(1.0, 0.0)
        for (i in 0 until n)  // n-1 compris
            r = r.mul(this)
        return r
    }

    /**
     * inverse du nombre complexe
     * précondition : this est non nul
     * @return inverse (Complexe)
     */
    fun inverse(): Complexe
            =Complexe(reel / (reel * reel + im * im), -im / (reel * reel + im * im))

    /**
     * division du nombre complexe par z
     * précondition : z non nul
     * @param z, diviseur
     * @return quotiont (Complexe)
     */
    fun div(z: Complexe): Complexe = this.mul(z.inverse())

    override fun toString(): String = "$reel + i $im"

    companion object {
        val I = Complexe(0.0, 1.0)
        val J = Complexe(-1 / 2.0, Math.sqrt(3.0) / 2)
    }

}

// question 1 --> avant l'ajout des getters
/*
class Complexe constructor(_reel:Double = 0.0, _im:Double= 0.0)  {
    private val reel:Double=_reel
    private val im: Double=_im

    constructor(c:Complexe): this(c.reel, c.im) {
    }
}*/
