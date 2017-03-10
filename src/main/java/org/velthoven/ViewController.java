package org.velthoven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    public ViewController() {
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
