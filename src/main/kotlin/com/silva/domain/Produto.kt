package com.silva.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Produto(@Id @GeneratedValue(strategy =GenerationType.IDENTITY) var id: Long, var nome: String, var preco: Double) {
}