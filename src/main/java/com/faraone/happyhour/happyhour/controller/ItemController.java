package com.faraone.happyhour.happyhour.controller;

import com.faraone.happyhour.happyhour.service.interfaces.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;
}
