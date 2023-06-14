package com.gitfit.backend.controllers

import com.gitfit.backend.domain.Subscriber
import com.gitfit.backend.repositories.SubscriberRepository
import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin
class SubscriberController(private val subscriberRepository: SubscriberRepository)  {

    @GetMapping("/api/subscribers")
    fun allSubscribers() : List<Subscriber>? {
        return subscriberRepository.findAll()
    }
    @GetMapping("/api/subscribers/location/{location}")
    fun getSubscribersByLocation(@PathVariable location: String): List<Subscriber>? {
        return subscriberRepository.findByAddressContaining(location)
    }
    @PostMapping("/api/subscribers")
    fun addSubscriber(@RequestBody subscriber: Subscriber):  Subscriber? {
        return subscriberRepository.save(subscriber)
    }
}