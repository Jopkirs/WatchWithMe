package com.kaigo.watchwithme.repository;

import com.kaigo.watchwithme.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
