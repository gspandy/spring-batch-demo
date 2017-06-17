package com.xing.springbatch.jdbc.fixed;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author zhaoxing
 * @version Id: Student.java, v 0.1 2017.2.28 13:52 zhaoxing Exp $$
 */
@Component
@Scope("prototype")
public class Student implements Serializable {
    /** ID */
    private String id = "";
    /** 名字 */
    private String name = "";
    /** 年龄 */
    private int age = 0;
    /** 分数 */
    private float score = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
