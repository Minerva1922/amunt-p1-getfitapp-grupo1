
package com.gitfit.backend

import com.gitfit.backend.domain.Subscriber
import com.gitfit.backend.repositories.SubscriberRepository
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.http.HttpStatus


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BackendApplicationTests {

    @LocalServerPort
    private var port: Int = 0

    @Autowired
    private lateinit var api: TestRestTemplate

    @Autowired
    private lateinit var subscriberRepository: SubscriberRepository

    @Test
    fun `devuelve una lista de subscriptores`() {

        val subscribers = listOf(
            Subscriber("Minerva", "Pedret", "Calle 1", "Marzo", 673408687, "minerva@gmail.com"),
            Subscriber("Jhoana", "Vicente", "Calle 2", "Febrero", 673408687, "jhoana@gmail.com")
        )

        subscriberRepository.saveAll(subscribers)

        val response = api.getForEntity("/api/subscribers", Array<Subscriber>::class.java)

        assertThat(response.statusCode, equalTo(HttpStatus.OK))
        assertThat(response.body?.toList(), equalTo(subscribers))
    }
}

