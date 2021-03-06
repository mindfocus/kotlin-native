@Suppress("NOTHING_TO_INLINE")
inline fun <reified T> foo (i2: Any): Boolean {
    return i2 is T
}

fun bar(i1: Int): Boolean {
    return foo<Double>(i1)
}

fun main(args: Array<String>) {
    println(bar(1).toString())
}
