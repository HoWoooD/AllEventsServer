package com.algys.allevents.server.service;

import com.algys.allevents.server.entity.Event;
import com.algys.allevents.server.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventsServiceImpl implements EventsService {

    @Autowired
    private EventRepository repository;

    @Override
    public List<Event> getAll() {
        return repository.findAll();
    }

    @Override
    public Event getByID(long id) {
        return null;
    }

    @Override
    public Event save(Event event) {
        return repository.saveAndFlush(event);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);
    }
}
