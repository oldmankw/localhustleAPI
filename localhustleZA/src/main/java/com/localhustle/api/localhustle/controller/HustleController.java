/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.localhustle.api.localhustle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author photo
 */
@RestController
@RequestMapping("/api")
public class HustleController 
{
    @GetMapping("/hustle")
    public String getHello()
    {
        return "Heeeeeeeeeeeeeeeeeee Yooooouuuuuuuuuuuuuu";
    }
}
