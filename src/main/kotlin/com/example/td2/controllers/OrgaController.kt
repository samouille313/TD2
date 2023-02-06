package com.example.td2.controllers

import com.example.td2.repositories.OrganizationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Repository
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import javax.management.modelmbean.ModelMBean

@Controller
@RequestMapping("/orgas/")
class OrgaController {

    @Autowired
    lateinit var orgaRepository: OrganizationRepository


    @RequestMapping(path =["","index"])
    fun indexAction(model:ModelMap):String{
        model["orgas"]=orgaRepository.findAll()
        return "/orgas/index"
    }
}