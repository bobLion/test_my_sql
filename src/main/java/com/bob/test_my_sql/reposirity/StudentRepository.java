package com.bob.test_my_sql.reposirity;

import com.bob.test_my_sql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author LiuHaoiang
 * @date 2018/1/31 14:28
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public  List<Student> findByName(String name);

    public List<Student> deleteByName(String name);
}
