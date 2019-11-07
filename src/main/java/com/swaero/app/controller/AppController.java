package com.swaero.app.controller;

import com.swaero.app.model.Swaero;
import com.swaero.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("api/v1")
public class AppController {
    private AppService appService;

    @Autowired
    public AppController(AppService appService){
        this.appService = appService;
    }

    @GetMapping("/hello")
    public String greetings(){
        return "Hello";
    }

    @GetMapping("/findAll")
    public List<Swaero> findAll() {
        return appService.findAll();
    }

    @PostMapping(value = "/save", consumes = {APPLICATION_JSON_VALUE},
            produces = {APPLICATION_JSON_VALUE})
    public Swaero save(@Valid @RequestBody Swaero swaero) {
        return appService.save(swaero);
    }

}
