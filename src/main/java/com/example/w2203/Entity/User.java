package com.example.w2203.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "W_USER")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @Column(nullable = false,length = 32)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String userId;
    @Column(length = 8)
    private String userName;
    @Column(length = 20)
    private String userData;
    @Column(length = 20)
    private String ct;


}
