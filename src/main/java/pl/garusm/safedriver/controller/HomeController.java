package pl.garusm.safedriver.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.garusm.safedriver.model.User;
import pl.garusm.safedriver.service.UserService;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Welcome";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() {
        return "admin";
    }

    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        userService.saveUser(user);
        return "-created-";
    }

}
