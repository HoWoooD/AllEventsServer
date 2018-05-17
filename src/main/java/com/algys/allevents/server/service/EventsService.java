package com.algys.allevents.server.service;

import com.algys.allevents.server.entity.Event;

import java.util.List;
import java.util.Optional;

public interface EventsService {

    List <Event> getAll();
    Optional<Event> getByID(long id);
    Event save(Event event);
    void remove(long id);

}
