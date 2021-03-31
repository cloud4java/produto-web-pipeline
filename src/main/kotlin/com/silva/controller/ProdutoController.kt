package com.silva.controller

import com.silva.domain.Produto
import com.silva.domain.ProdutoRepository
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import javax.inject.Inject

@Controller("/produto")
class ProdutoController {
    @Inject
    lateinit var repository: ProdutoRepository

    @Post
    fun create(@Body produto: Produto): Produto {
        return repository.save(produto)
    }

    @Get
    fun findAll(): List<Produto> {
        return repository.findAll() as List<Produto>
    }

    @Get("/stub")
    fun stub(): Produto {
        return Produto(1, "Produto 1", 9.90)
    }

    @Get("stub1")
    fun stub1(): Produto {
        return Produto(1, "Produto 1", 9.90)
    }


}