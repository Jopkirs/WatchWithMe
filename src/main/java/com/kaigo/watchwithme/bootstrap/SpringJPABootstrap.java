package com.kaigo.watchwithme.bootstrap;

import com.kaigo.watchwithme.domain.Room;
import com.kaigo.watchwithme.domain.User;
import com.kaigo.watchwithme.services.RoomService;
import com.kaigo.watchwithme.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SpringJPABootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private RoomService roomService;
    private UserService userService;

    @Autowired
    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        loadRooms();
//        loadUsers();
    }

    /*
    public void loadRooms() {

        Room room1 = new Room();
        room1.setId(1);
        room1.setRoomUrl("shbakg124bdkjf2");
        room1.setVideoUrl("youtube.com/248723jhdf");
        room1.setConnectedUsers(new ArrayList<>());
        roomService.saveOrUpdateRoom(room1);

        Room room2 = new Room();
        room2.setId(2);
        room2.setRoomUrl("blabla.com");
        room2.setVideoUrl("youtube.com/catdjivideo");
        room2.setConnectedUsers(new ArrayList<>());
        roomService.saveOrUpdateRoom(room2);
    }

    public void loadUsers() {

        User user1 = new User();
        user1.setId(1);
        user1.setSessionId("17483");
        userService.saveOrUpdateUser(user1);
    }
*/
}
