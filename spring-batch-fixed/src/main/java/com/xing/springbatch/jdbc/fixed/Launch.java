package com.xing.springbatch.jdbc.fixed;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("batch.xml");
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("fixedLengthJob");

        try {
            // JOB实行
            JobExecution result = launcher.run(
                    job,
                    new JobParametersBuilder()
                            .addString("inputFilePath",
                                    "fixedLengthInputFile.txt")
                            .addString("outputFilePath",
                                    "fixedLengthOutputFile.txt")
                            .toJobParameters());
            // 运行结果输出
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}