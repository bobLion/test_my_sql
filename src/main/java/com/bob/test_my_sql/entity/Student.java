package com.bob.test_my_sql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LiuHaoiang
 * @date 2018/1/31 13:57
 */
@Entity
@Table(name = "student")
public class Student  {

    @Id
    @GeneratedValue
    private Integer id;

    private String age;

    private String name;

    public Student(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

