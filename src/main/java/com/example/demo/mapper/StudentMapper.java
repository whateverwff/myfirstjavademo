package com.example.demo.mapper;


import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface StudentMapper {

    List<User> queryStudentList();
    User queryStudentList1(String  cid);

    List<User> queryStudentList2();
}
