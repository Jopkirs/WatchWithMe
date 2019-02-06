package com.kaigo.watchwithme.controllers;

import com.kaigo.watchwithme.domain.Room;
import com.kaigo.watchwithme.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(path = "/room/{id}")
    public Room getRoomById(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }

    @PostMapping("/rooms")
    public Room newRoom(@RequestBody Room newRoom){
        return roomService.saveOrUpdateRoom(newRoom);
    }

}
