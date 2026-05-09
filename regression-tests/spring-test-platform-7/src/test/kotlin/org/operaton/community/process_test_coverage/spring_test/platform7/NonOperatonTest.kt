package org.operaton.community.process_test_coverage.spring_test.platform7

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Configuration


@Configuration
class NonOperatonApplication

@SpringBootTest(classes = [NonOperatonApplication::class])
class NonOperatonTest {

    @Test
    fun testSomethingNotCamunda() {
        val testString = "Testing"
        Assertions.assertThat(testString).isNotEmpty()
    }

}