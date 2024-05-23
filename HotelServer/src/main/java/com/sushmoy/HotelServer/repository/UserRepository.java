package com.sushmoy.HotelServer.repository;

import com.sushmoy.HotelServer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<User,Long> {

}
