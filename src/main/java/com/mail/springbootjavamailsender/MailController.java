package com.mail.springbootjavamailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RestController
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping(value = "/send-email")
    public String send(String to, String subject, String body) throws MessagingException{

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try{
            helper.setTo("nirwansyah.dicka@gmail.com");
            helper.setText("Hallo from spring boot starter mail.");
            helper.setSubject("Mail from spring boot");
        }catch (MessagingException e){
            e.printStackTrace();
            return "error while sending email..";
        }
        javaMailSender.send(message);
        return "successfully sending email..";
    }
}
