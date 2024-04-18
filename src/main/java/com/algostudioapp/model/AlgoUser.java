package com.algostudioapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

// Todo: Remove @Data annotation, only here for testing purposes
@Data
@Entity
public class AlgoUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String username;
    private String password;
}
