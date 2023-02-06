package com.example.td2.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
open class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id:Int?=null

    @Column(nullable = false, unique = true, length = 45)
    open lateinit var name:String

    @Column(length = 60)
    open var email:String?=null

    @Column(length = 30)
    open var aliases:String?=null

}