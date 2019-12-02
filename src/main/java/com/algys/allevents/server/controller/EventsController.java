package com.algys.allevents.server.controller;

import com.algys.allevents.server.entity.Event;
import com.algys.allevents.server.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class EventsController {

    @Autowired
    private EventsService service;


    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @ResponseBody
    public Event getAllEventsTest(){
        return createMock();
    }

    @RequestMapping(value = "/events/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Event> getAllEvents(){
        return service.getAll();
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Event getEvent(@PathVariable("id") long eventID){
        return service.getByID(eventID);
    }

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    @ResponseBody
    public Event saveEvent(@RequestBody Event event){
        return service.save(event);
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id){
        service.remove(id);
    }

    public Event createMock(){
        Event first = new Event();
        first.setId(1);
        first.setEventDate(new Date());
        first.setTitle("Концерт");
        return first;
    }
}
