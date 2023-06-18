package com.gitfit.backend

import com.gitfit.backend.domain.Subscriber
import com.gitfit.backend.repositories.SubscriberRepository
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = RANDOM_PORT)
class SubscriberApiTest {

    @Autowired
    private lateinit var api: TestRestTemplate
    @Autowired
    private lateinit var subscriberRepository: SubscriberRepository

    @BeforeEach
    fun setUp() {
        subscriberRepository.deleteAll()
    }

    @Test
    fun `devuelve los suscriptores que haya en la base de datos`() {

        // si en la base de datos tenemos unos suscriptores
        val subscribers = subscriberRepository.saveAll(listOf(
                Subscriber(1, "Minerva", "Pedret", "Plaza 14 Madrid", "September", 618144754 , "minervapv83@gmail.com"),
                Subscriber(2, "Jhoana", "Vicente", "Plaza Catalana 123 Barcelona", "Enero", 618144754 , "jhoanapv83@gmail.com")
        ))

        // y pedimos a través de la api que nos devuelvan los suscriptores
        val response = api.getForEntity("/api/subscribers", Array<Subscriber>::class.java)

        // entonces lo que me devuelve la Api es lo mismo que hay dentro de la base de datos
        assertThat(response.statusCode, equalTo(HttpStatus.OK))
        assertThat(response.body?.asList(), equalTo(subscribers))
    }
}