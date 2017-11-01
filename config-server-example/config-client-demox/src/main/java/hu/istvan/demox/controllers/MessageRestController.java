package hu.istvan.demox.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

    @Value("${user:Username default}")
    private String user;

    @Value("${password:Password default}")
    private String password;
    
    @RequestMapping("/user")
    public String getUser() {
        return "user: " + this.user + " password: " + this.password;
    }
    
}
