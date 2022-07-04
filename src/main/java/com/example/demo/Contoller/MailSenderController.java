package com.example.demo.Contoller;

import com.example.demo.Service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSenderController {
    private final MailSenderService mailSenderService;



    public MailSenderController(MailSenderService mailSenderService){this.mailSenderService=mailSenderService;}


    @CrossOrigin
    @RequestMapping(value = "/sendMail")
    public String sendMail(){

      return  mailSenderService.sendSimpleMessage("ayberk.orhan@32bit.com.tr","test mail ","react ile gönderildi ");


    }
}
