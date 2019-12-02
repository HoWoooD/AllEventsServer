package com.algys.allevents.server.service;

import com.algys.allevents.server.entity.Event;

import java.util.List;

public interface EventsService {

    List <Event> getAll();
    Event getByID(long id);
    Event save(Event event);
    void remove(long id);

}
