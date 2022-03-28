package com.example.w2203.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "W_TEST1")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestTab {

    @Id
    @Column(nullable = false,length = 32)
    private String userId;
    @Column(length = 8)
    private String userName;

}
