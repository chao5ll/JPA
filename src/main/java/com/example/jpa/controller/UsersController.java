package com.example.jpa.controller;

import com.example.jpa.entities.Author;
import com.example.jpa.entities.Book;
import com.example.jpa.entities.Gender;
import com.example.jpa.entities.Publisher;
import com.example.jpa.service.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Map;
import java.util.Random;

@Controller
public class UsersController {
    /*private final Random random;

    @Autowired
    BookManager bookManager;

    public UsersController() {
        try {
            this.random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Map<String, Object> model) {
        model.put("publishers", this.bookManager.getPublishers());
        model.put("authors", this.bookManager.getAuthors());
        model.put("books", this.bookManager.getBooks());

        return "entities";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public View add() {
        Publisher publisher = new Publisher();
        publisher.setName("John Wiley & Sons");
        publisher.setAddress("1234 Baker Street");
        publisher.setDateFounded(Calendar.getInstance());
        this.bookManager.savePublisher(publisher);

        Author author = new Author();
        author.setName("Nicholas S. Williams");
        author.setEmailAddress("nick@example.com");
        author.setGender(Gender.MALE);
        this.bookManager.saveAuthor(author);

        Book book = new Book();
        book.setIsbn("" + this.random.nextInt(Integer.MAX_VALUE));
        book.setTitle("Professional Java for Web Applications");
        book.setAuthor("Nicholas S. Williams");
        book.setPublisher("John Wiley & Sons");
        book.setPrice(59.99D);
        this.bookManager.saveBook(book);

        return new RedirectView("/", true, false);
    }*/
}
