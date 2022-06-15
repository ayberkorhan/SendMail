package com.example.demo.Contoller;

import com.example.demo.Service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSenderController {
    private final MailSenderService mailSenderService;



    public MailSenderController(MailSenderService mailSenderService){this.mailSenderService=mailSenderService;}



    @RequestMapping(value = "/sendMail")
    public String sendMail(){

      return  mailSenderService.sendSimpleMessage("ayberk.test12@gmail.com","test mail ","from controller ");


    }
}
