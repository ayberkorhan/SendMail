package com.example.demo.Service;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

    private  JavaMailSender mailSender;

    public MailSenderService(JavaMailSender mailSender){this.mailSender=mailSender;}

    public  String sendSimpleMessage(
            String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("ayberkorhanfakeadres@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
        return ("mail "+to+" adresine gönderildi...");

    }
}
