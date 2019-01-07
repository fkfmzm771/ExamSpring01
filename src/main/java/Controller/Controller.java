package Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

//    Logger logger = (Logger) LogFactory.getLog(Controller.class);

    @RequestMapping(value = "/")
    public String test() {
        return "index";
    }

    @RequestMapping(value = "/spin")
    public String spin() {
        return "index";
    }

    @RequestMapping(value = "/res")
    public String res_form() {
        return "res";
    }
}
