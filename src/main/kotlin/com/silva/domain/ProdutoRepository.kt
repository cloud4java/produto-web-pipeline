package com.silva.domain

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface ProdutoRepository: CrudRepository<Produto, Long> {
}