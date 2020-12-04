package com.hello.dao;

import com.hello.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    //获取指定老师及其对应所有学生的信息
    Teacher getTeacher(@Param("tid") int id);
    Teacher getTeacher2(@Param("tid") int id);
}
