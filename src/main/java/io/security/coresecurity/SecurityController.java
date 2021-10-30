package io.security.coresecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "loginPage";
    }

}
