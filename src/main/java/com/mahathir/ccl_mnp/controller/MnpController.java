package com.mahathir.ccl_mnp.controller;

import com.mahathir.ccl_mnp.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MnpController {

    @Autowired
    private DataService dataService;

    @PostMapping("/number")
    public int fun(@RequestBody String number){
        return dataService.findRecepientRC(number);
    }
}
