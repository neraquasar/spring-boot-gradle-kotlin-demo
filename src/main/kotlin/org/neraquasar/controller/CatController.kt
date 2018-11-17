package org.neraquasar.controller

import org.neraquasar.dao.CatDao
import org.neraquasar.model.Cat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CatController @Autowired constructor(private val catDao: CatDao) {

    @RequestMapping("cats")
    fun cats(): Collection<Cat> {
        return catDao.findAll()
    }

    @RequestMapping("add-cat")
    fun addCat(@RequestParam(value = "name", required = true) name:String) {
        val cat = Cat()
        cat.name = name
        catDao.save(cat)
    }
}
