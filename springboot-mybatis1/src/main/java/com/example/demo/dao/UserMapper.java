package com.example.demo.dao;

import com.example.demo.vo.TUser;
import org.apache.ibatis.annotations.*;

/**
 * Created by Administrator on 2017/9/13.
 */
@Mapper
public interface UserMapper {
    @Results({
            @Result(property = "userEmail", column = "USER_EMAIL")
    })

    @Select("select * from t_user where USER_NAME = #{USER_NAME}")
    TUser findByUserName(@Param("USER_NAME")String USER_NAME);

    @Select("select * from t_user where USER_ID = #{id}")
    TUser findByUserId(@Param("id")Integer USER_ID);
}
