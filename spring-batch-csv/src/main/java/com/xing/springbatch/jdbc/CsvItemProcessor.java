package com.xing.springbatch.jdbc;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * CsvItemProcessor类用来对Reader取得的数据进行处理
 * @author zhaoxing
 * @version Id: CsvItemProcessor.java, v 0.1 2017.2.27 15:43 zhaoxing Exp $$
 */
@Component("csvItemProcessor")
public class CsvItemProcessor implements ItemProcessor<Student, Student> {

    /**
     * 对取到的数据进行简单的处理。
     *
     * @param student 处理前的数据。
     * @return 处理后的数据。
     * @exception Exception 处理是发生的任何异常。
     */
    public Student process(Student student) throws Exception {
        /* 合并ID和名字 */
        student.setName(student.getId() + "--" + student.getName());
        /* 年龄加2 */
        student.setAge(student.getAge() + 2);
        /* 分数加10 */
        student.setScore(student.getScore() + 10);
        /* 将处理后的结果传递给writer */
        return student;
    }
}
