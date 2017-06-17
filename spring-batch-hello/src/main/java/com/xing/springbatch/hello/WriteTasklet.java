package com.xing.springbatch.hello;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * 此类中定义了一个message属性，通过batch.xml的“hello”和“world” Bean为其注入值。
 * execute方法，是由Tasklet接口继承而来的，是Tasklet实现业务逻辑的地方
 * @author zhaoxing
 * @version Id: writeTasklet.java, v 0.1 2017.2.27 14:22 zhaoxing Exp $$
 */
public class WriteTasklet implements Tasklet {

    /**
     * Message
     */
    private String message;

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }


    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println(message);
        return RepeatStatus.FINISHED;
    }
}
