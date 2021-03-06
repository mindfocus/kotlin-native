import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.*


fun box() {
    val success = try {
        mutableListOf(1, 2, 3).asReversed().add(4, 0)
        true
    } catch(expected: IndexOutOfBoundsException) {
        false
    }

    assertFalse(success)
}
