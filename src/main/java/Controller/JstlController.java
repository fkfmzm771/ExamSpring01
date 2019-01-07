package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class JstlController {

    @RequestMapping(value = "/jstl1")
    public String jstl1(Model model) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");

        int number = 1;
        String str = "abc";
        String phone = "111-555-8888";
        String data = "<marquee>문자열</marquee>";

        model.addAttribute("number", number);
        model.addAttribute("str", str);
        model.addAttribute("list", list);
        model.addAttribute("phone", phone);
        model.addAttribute("data", data);


        return "jstl1";
    }

    @RequestMapping(value = "/jstl2")
    public String jstl2(Model model) {
        Date today = new Date();
        double num1 = 12345.678;
        double num2 = 99.9;
        double num3 = 0.1;

        model.addAttribute("today", today);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("num3", num3);

        return "jstl2";

    }


    @RequestMapping(value = "/jstl3")
    public String jstl3(Model model) {


        return "jstl3";
    }
    @RequestMapping(value = "/test")
    public String test(Model model) {


        return "test";
    }

}
