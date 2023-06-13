package com.gitfit.backend.controllers

import com.gitfit.backend.domain.Subscriber
import com.gitfit.backend.repositories.SubscriberRepository
import org.springframework.web.bind.annotation.*


@RestController
class SubscriberController(private val subscriberRepository: SubscriberRepository)  {

    @GetMapping("/subscribers")
    fun allSubscribers() : List<Subscriber>? {
        return subscriberRepository.findAll()
    }
    @GetMapping("/subscribers/location/{location}")
    fun getSubscribersByLocation(@PathVariable location: String): List<Subscriber>? {
        return subscriberRepository.findByAddressContaining(location)
    }
    @PostMapping("/subscribers")
    fun addSubscriber(@RequestBody subscriber: Subscriber):  Subscriber? {
        return subscriberRepository.save(subscriber)
    }
}