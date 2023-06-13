package com.gitfit.backend.domain

import jakarta.persistence.*


@Table(name = "subscribers")
@Entity
data class Subscriber(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var name: String,
    val second: String,
    val address: String,
    val data: String,
    val phone: Long,
    val email: String
)

