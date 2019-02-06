package com.kaigo.watchwithme.bootstrap;


import com.kaigo.watchwithme.domain.Room;
import com.kaigo.watchwithme.domain.User;
import com.kaigo.watchwithme.repository.RoomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@Slf4j
public class LoadRoomDatabase {

    @Bean
    CommandLineRunner initRoomDatabase(RoomRepository roomRepository){
        return args -> {
            log.info("Preloading" + roomRepository.save(new Room(1L, new ArrayList<>(), "hdshshd", "fhsdjfjs")));
            log.info("Preloading" + roomRepository.save(new Room(2L, new ArrayList<>(), "room.url", "video.com")));
        };
    }
}
