package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// These legacy javax imports will be transformed into jakarta.*
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

@RestController
public class DemoController {

    @GetMapping("/test")
    public String testMigration(HttpServletRequest request, @NotNull String param) {
        return "Migrated successfully! IP: " + request.getRemoteAddr();
    }
}