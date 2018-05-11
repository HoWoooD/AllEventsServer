package com.algys.allevents.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/events")
public class EventsController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getEvents(ModelMap model){
        return "My event";
    }
}
