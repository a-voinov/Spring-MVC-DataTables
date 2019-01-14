package com.tutorial.app.controller;

import com.tutorial.app.model.DataTablesFactory;
import com.tutorial.app.model.DataTablesWrapper;
import com.tutorial.app.model.params.DataTablesParams;
import com.tutorial.app.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  Controller for data tables data processing
 */
@RestController
@RequestMapping("/processing")
public class DataTablesRestController {

    @Autowired
    private EntityService paymentService;

    @PostMapping(path="/payments")
    public DataTablesWrapper payments(@RequestBody DataTablesParams params){
        return DataTablesFactory.getAll(paymentService, params);
    }

}
