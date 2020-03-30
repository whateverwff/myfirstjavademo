package com.example.demo.mapper;


import com.example.demo.Entity.Middletable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface StudentMapper {

    List<Map<String,Object>> queryStudentList(Integer id);

    int insertMiddletable(Middletable middletable);

    List<Map<String,Object>> getAllCourse();

    List<Middletable> selectCourseById(Middletable middletable);

    Integer deleteCourseById(Integer id);

    void setCourseReadByCid(String uid,String cid);

    void updateMiddletable(Middletable middletable);
}
