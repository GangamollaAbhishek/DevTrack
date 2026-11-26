package com.devtrack.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles the root web mapping and renders the initial status page.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "DevTrack");
        model.addAttribute("statusMessage", "DevTrack Backend is Running Successfully!");
        return "index";
    }
}

