package com.example.email.controller;


import com.example.email.domain.EmailRequest;
import com.example.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail() {
        EmailRequest emailRequest = new EmailRequest();
        emailRequest.setTo("mateusrodrigues-cp@hotmail.com");
        emailRequest.setSubject("mateusrodrigues-cp@hotmail.com");
        emailRequest.setBody("mateusrodrigues-cp@hotmail.com");
        emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
        return "Email sent successfully!";
    }
}