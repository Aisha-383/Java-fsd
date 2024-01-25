package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/input")
    public String showInputForm() {
        return "input";
    }

    @PostMapping("/validate")
    public String validateUserId(@RequestParam("userId") Long userId, Model model) {
        if (userService.validateUserId(userId)) {
            User user = userService.findById(userId);
            model.addAttribute("user", user);
            return "editForm";
        } else {
            model.addAttribute("error", "Invalid User ID");
            return "error";
        }
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "confirmation";
    }
}
