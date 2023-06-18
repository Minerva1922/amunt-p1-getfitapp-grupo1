package com.gitfit.backend.repositories

import com.gitfit.backend.domain.Subscriber
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SubscriberRepository : JpaRepository<Subscriber, Long> {
    fun findByAddressContaining(location: String): List<Subscriber>

}