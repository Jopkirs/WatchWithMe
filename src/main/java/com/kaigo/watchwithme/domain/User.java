package com.kaigo.watchwithme.domain;

import lombok.*;
import org.hibernate.id.GUIDGenerator;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sessionId;

}
