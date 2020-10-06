package com.gengdan.demo.mapper;


import com.gengdan.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    User selectUserById(@Param("id") int id);


}
