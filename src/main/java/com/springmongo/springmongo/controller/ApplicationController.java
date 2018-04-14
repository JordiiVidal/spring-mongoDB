package com.springmongo.springmongo.controller;

import com.springmongo.springmongo.model.Team;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;

    public ApplicationController(ApplicationRepository applicationRepository){this.applicationRepository = applicationRepository;}

    @RequestMapping(value = "/")
    public String homePage(Model model, @RequestParam(defaultValue = "0") int page){

        model.addAttribute("data", applicationRepository.findAll(new PageRequest(page,4)));
        model.addAttribute("currentPage",page);

        return "home";
        //return del nombre del html que queremos ver
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Team data){

        this.applicationRepository.save(data);

        return "redirect:/";
    }
    @RequestMapping(value = "/update")
    public String update(Model model, String id){
        model.addAttribute("data", applicationRepository.findAllById(id));
        return "update";
    }@RequestMapping(value = "/create")
    public String newTeam(Model model){
        model.addAttribute("datanew", new Team("",0,"","",""));
        return "create";
    }
    @RequestMapping(value = "/delete")
    public String deleteTeam(Model model, String id){
        applicationRepository.deleteById(id);
        return "redirect:/";
    }


}
