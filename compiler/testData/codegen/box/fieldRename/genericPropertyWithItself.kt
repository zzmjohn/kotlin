// IGNORE_BACKEND: JS_IR
public class MPair<out A> (
        public val first: A
) {
    override fun equals(o: Any?): Boolean {
        val t = o as MPair<*>
        return first == t.first
    }
}

fun box(): String {
   val a = MPair("O")
   a.equals(a)
   return "OK"
}