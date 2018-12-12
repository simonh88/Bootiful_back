package com.bootiful.controllers;

import com.bootiful.services.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "api/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @GetMapping("/current")
    @CrossOrigin(origins = "http://localhost:4200")
    public int currentNum() {
        return adderService.currentBase();
    }

    @GetMapping("/generate")
    @CrossOrigin(origins = "http://localhost:4200")
    public int generateNum() {
        return adderService.generateBase();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public int add(@RequestBody @Valid int numberToAdd)
    {
        return adderService.add(numberToAdd);
    }
}
