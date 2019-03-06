package com.example.demo;

import com.example.jpa.service.BookManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication
public class DemoApplicationTests {

    @Autowired
    private BookManager bookManager;
    @Test
    public void contextLoads() {
        bookManager.getBooks().forEach(System.out::println);
    }

}
