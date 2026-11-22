package com.smartbudget.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public Map<String, String> welcome() {
        return Map.of(
                "application", "SmartBudget AI",
                "description", "Assistente financeiro inteligente",
                "healthEndpoint", "/api/health"
        );
    }
}
