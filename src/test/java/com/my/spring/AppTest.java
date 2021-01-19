package com.my.spring;

import static org.junit.Assert.assertTrue;

import com.my.spring.bean.SiChuan;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/resources/spring.xml");
        SiChuan siChuan = (SiChuan) context.getBean("siChuan");
        System.out.println(siChuan.getDesc());
    }
}
