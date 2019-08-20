package task3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Task3Controller {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
