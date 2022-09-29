import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class HelloWorldTest {

    @Test
    fun test() {

        val helloWorld = HelloWorld()
        Assertions.assertThat(helloWorld.test()).isEqualTo("hello world")
    }
}
