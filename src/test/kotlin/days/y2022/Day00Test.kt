package days.y2022


import days.Day
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.jupiter.api.Test


class Day00Test {

    @Test
    fun testExampleOne() {
        assertThat(Day00().partOne("""
            1
            2
            3
        """.trimIndent()), `is`(-1))
    }

    @Test
    fun testPartOne() {
        assertThat(Day00().partOne(), `is`(-1))
    }

    @Test
    fun testExampleTwo() {
        assertThat(Day00().partTwo("""
            1
            2
            3
        """.trimIndent()), `is`(-1))
    }

    @Test
    fun testPartTwo() {
        assertThat(Day00().partTwo(), `is`(-1))
    }
}



class Day00 : Day(2022, 0) {
    override fun partOne(input: String): Any {
        return -1
    }

    override fun partTwo(input: String): Any {
        return -1
    }
}