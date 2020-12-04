package com.hello.dao;

import com.hello.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    //@Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
