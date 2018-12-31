package Controller;

import VO.Member;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@org.springframework.stereotype.Controller
public class Controller {

    Logger logger = (Logger) LogFactory.getLog(Controller.class);

    @RequestMapping(value = "/")
    public String test() {
        return "index";
    }

    @RequestMapping(value = "/login_form")
    public String login_form() {
        return "login";
    }

    @RequestMapping(value = "/member_form")
    public String member_form() {
        return "member";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Member member, Model model) {

        if (login_check(member)) {
            model.addAttribute("member", member);
            return "main";
        }else{

            return "login";
        }


    }

    public boolean login_check(Member member) {
        if (member.getAge() < 20) {
            return false;
        } else {
            return true;
        }
    }

}
