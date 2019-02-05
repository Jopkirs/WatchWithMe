package com.kaigo.watchwithme.controllers;

import com.kaigo.watchwithme.domain.Room;
import com.kaigo.watchwithme.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    //TODO: postRoom нужно

    @GetMapping(path = "/room/{id}")
    public Room getRoomById(@PathVariable long id) {
        return roomService.getRoomById(id);
    }

}
