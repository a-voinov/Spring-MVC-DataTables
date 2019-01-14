package com.tutorial.app.controller;

import com.tutorial.app.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Homepage controller
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "hello";
    }

    @Autowired
    @Qualifier("paymentService")
    private EntityService paymentService;

    @GetMapping("/data")
    public String data(Model model){
        return "data";
    }

}
