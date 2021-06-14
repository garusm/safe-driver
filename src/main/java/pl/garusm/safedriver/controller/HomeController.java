package pl.garusm.safedriver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.garusm.safedriver.model.User;
import pl.garusm.safedriver.service.UserService;

@RestController
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/")
    @ResponseBody
    public String index() { return "Welcome everyone !";
    }

    @GetMapping("/user")
    @ResponseBody
    public String admin(User user) {
        return "Welcome authenticated user !";
    }

}
