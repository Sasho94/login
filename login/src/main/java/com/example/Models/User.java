package com.example.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by amladzhov on 2/3/2017.
 */
@Setter
@Getter
@Entity
public class User implements Serializable {
    @Id
    @Column
    Long id;

    @Column
    String name;

    @Column
    String password;

    @Column
    String email;


}
