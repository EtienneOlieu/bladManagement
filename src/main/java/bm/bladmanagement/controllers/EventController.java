package bm.bladmanagement.controllers;

import bm.bladmanagement.services.IEventService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private IEventService eventService;

    public EventController(IEventService eventService){
        this.eventService = eventService;
    }
}
