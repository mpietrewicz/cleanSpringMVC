package com.mpietrewicz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @GetMapping({"/"})
    public String showSimplePage() {
        return "mainPage";
    }

    @GetMapping({"/date"})
    public String showaActualDate() {
        return "date";
    }

}
