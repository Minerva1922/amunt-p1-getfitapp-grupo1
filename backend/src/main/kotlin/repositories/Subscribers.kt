package com.gitfit.backend.domain

import jakarta.persistence.*

@Entity
@Table(name = "subscribers")
data class Subscribers(
    var name: String,
    val lastName: String,
    val address: String,
    val subscriptionDate: String,
    val phone: Int,
    val email: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    var id: Long? = null
}


