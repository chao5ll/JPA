package com.example.jpa.repository;

import com.example.jpa.entities.Params;
import com.example.jpa.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Mapper
public interface UsersMapper{

    List<String> findUsers(Params p);
    long countUsers();


}
