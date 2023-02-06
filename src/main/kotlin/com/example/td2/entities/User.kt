package com.example.td2.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id:Int?=null

    @Column(length = 45)
    open var firstname:String?=null

    @Column(length = 45)
    open var lastname:String?=null

    @Column(nullable = false, unique = true)
    open lateinit var email:String

    @Column(nullable = false)
    open lateinit var password:String

    open var suspended:Boolean=false

}