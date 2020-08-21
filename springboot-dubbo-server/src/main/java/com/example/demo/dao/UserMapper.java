package com.example.demo.dao;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@Mapper
public interface UserMapper {
    /**
     * 根据用户id找出用户
     * @param id
     * @return user
     */
    @Select("select * from user where id = #{id}")
    User selectUserById(int id);
}
