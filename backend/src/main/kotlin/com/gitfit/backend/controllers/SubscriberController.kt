package com.gitfit.backend.controllers

import com.gitfit.backend.domain.Subscriber
import com.gitfit.backend.repositories.SubscriberRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class SubscriberController(private val subscriberRepository: SubscriberRepository)  {

    @GetMapping("/subscribers")
    fun allSubscribers() : List<Subscriber>? {
        return subscriberRepository.findAll()
    }

    @PostMapping("/subscribers")
    fun addSubscriber(@RequestBody subscriber: Subscriber):  Subscriber? {
        return subscriberRepository.save(subscriber)
    }
}