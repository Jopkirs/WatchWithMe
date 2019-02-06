package com.kaigo.watchwithme.services;

import com.kaigo.watchwithme.domain.Room;
import com.kaigo.watchwithme.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room saveOrUpdateRoom(Room room){
        return roomRepository.save(room);
    }

    public Room getRoomById(long id){
        return roomRepository.findById(id).orElse(null);
    }

}
