package com.mail.springbootjavamailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class SmtpMailSender {


}
