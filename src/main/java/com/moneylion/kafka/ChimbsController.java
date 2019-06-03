package com.moneylion.kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ChimbsController {
    @GetMapping("/chimbs")
    public String get() {
        return "Chimbs Rocks";
    }
}
