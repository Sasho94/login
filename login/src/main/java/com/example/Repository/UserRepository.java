package com.example.Repository;

import com.example.Models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by amladzhov on 2/3/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
