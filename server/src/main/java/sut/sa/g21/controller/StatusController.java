/*
package com.example.demo.controller;

import java.util.Collection;

import Status;
import StatusRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController{
    private StatusRepository repo;

    public StatusController(StatusRepository repo){
        this.repo = repo;
    }

    @GetMapping("/Status")
    public Collection<Status> status(){
        return repo.findAll();
    }
}
*/