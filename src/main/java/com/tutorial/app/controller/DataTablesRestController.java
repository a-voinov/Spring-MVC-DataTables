package com.tutorial.app.controller;

import com.tutorial.app.model.DataTablesFactory;
import com.tutorial.app.model.DataTablesWrapper;
import com.tutorial.app.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Controller for data tables data processing
 */
@RestController
@RequestMapping("/processing")
public class DataTablesRestController {

    @Autowired
    @Qualifier("paymentService")
    private EntityService paymentService;

    @RequestMapping(path="/payments", method=RequestMethod.GET)
    public DataTablesWrapper payments(
            @RequestParam(name = "draw") int draw,
            @RequestParam(name = "start") int start,
            @RequestParam(name = "length") int length){
        return DataTablesFactory.getAll(paymentService, draw, length, start);
    }

}
