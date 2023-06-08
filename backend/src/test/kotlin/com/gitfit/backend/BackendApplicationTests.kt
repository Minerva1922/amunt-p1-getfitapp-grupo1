
package com.gitfit.backend

import com.gitfit.backend.domain.Subscribers
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.springframework.boot.test.web.server.LocalServerPort
import repositories.SubscriberRepository


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
            Subscribers("Minerva", "Pedret", "Calle 1", "Marzo", 673408687, "minerva@gmail.com"),
            Subscribers("Jhoana", "Vicente", "Calle 2", "Febrero", 673408687, "jhoana@gmail.com")
        )

        subscriberRepository.saveAll(subscribers)

        val response = api.getForEntity("/api/subscribers", Array<Subscribers>::class.java)

        assertThat(response.statusCode, equalTo(HttpStatus.OK))
        assertThat(response.body?.toList(), equalTo(subscribers))
    }
}

