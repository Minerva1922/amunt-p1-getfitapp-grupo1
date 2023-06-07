package com.gitfit.backend

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    private lateinit var api: TestRestTemplate

    @Test
    fun `devuelve una lista de subscriptores`() {

        val subscribers = ListOf(
            Subscriber("Minerva", "Pedret"),
            Subscriber("Jhoana", "Vicente")
        ).let{subscriberRepository.saveAll(it)}

        val response = api.getForEntity(url:"/api/subscribers", Array <Subscriber>::class.java)

        assertThat(response.statusCode, `is`(HttpStatus.OK))
        assertThat(response.body, equalTo(subscribers.toTypedArray()))
    }
}
