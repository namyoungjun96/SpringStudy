package com.example.begin.controller;

import com.example.begin.dto.DBoxDTO;
import com.example.begin.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.sql.SQLException;

@Controller
public class AController {
    @Autowired
    public BService bService;

    @GetMapping("hello")
    public String hello(Model model) {
        //DBoxDTO dBoxDTO=bService.Service();
        //model.addAttribute("testing", dBoxDTO.getUser_id());
        return "index";
    }

    @ModelAttribute("value")
    public DBoxDTO user() throws SQLException, ClassNotFoundException {
        DBoxDTO dBoxDTO=bService.Service();
        return dBoxDTO;
    }
}
