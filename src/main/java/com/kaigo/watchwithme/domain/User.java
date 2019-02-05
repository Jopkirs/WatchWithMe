package com.kaigo.watchwithme.domain;

import lombok.*;
import org.hibernate.id.GUIDGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String sessionId;

}
