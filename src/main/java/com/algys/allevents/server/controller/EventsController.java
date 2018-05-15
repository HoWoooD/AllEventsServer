package com.algys.allevents.server.controller;

import com.algys.allevents.server.entity.Event;
import com.algys.allevents.server.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Event getEvents(){
        eventRepository.findAll();
        return createMockEvent();
    }

    private Event createMockEvent() {
        Event event = new Event();
        event.setId(1);
        event.setEventDate(new Date());
        event.setTitle("My first event");

        return event;
    }
}
