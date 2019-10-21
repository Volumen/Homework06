package com.example.demo.email;

import com.example.demo.service.MovieService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Email {

    private JavaMailSender javaMailSender;
    private MovieService movieService;

    @Autowired
    public Email(JavaMailSender javaMailSender, MovieService movieService) {
    this.javaMailSender = javaMailSender;
    this.movieService = movieService;
    }

    @After(value = "@annotation(EmailAspect)")
    public void sendEmail()
    {
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setTo("pawel.pamula@op.pl");
        smm.setSubject("Hello, you just added a new movie! ");
        smm.setText("You add this movie: " + "\n"
                        + "Name: " + movieService.getLastAddedMovie().getName() + "\n"
                        + "Year: " + movieService.getLastAddedMovie().getYear() + "\n"
                        + "Producer: " + movieService.getLastAddedMovie().getProducer() + "\n"
        );
        javaMailSender.send(smm);
    }
}
