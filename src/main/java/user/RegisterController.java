package user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class RegisterController {

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}