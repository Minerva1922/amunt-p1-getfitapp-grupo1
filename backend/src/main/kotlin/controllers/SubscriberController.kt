package controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import repositories.SubscriberRepository

@RestController
class SubscriberController(private val subscribers: SubscriberRepository)  {

    @GetMapping("/subscribers")
    fun allSubscribers() = subscribers.findAll()

}