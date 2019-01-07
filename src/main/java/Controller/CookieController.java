package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @RequestMapping(value = "/cookie1", method = RequestMethod.GET)
    public String cookie1(HttpServletResponse response) {
        Cookie cookie1 = new Cookie("aa", "121");
        Cookie cookie2 = new Cookie("bb", "232");

        response.addCookie(cookie1);

        response.addCookie(cookie2);

        return "redirect:/";
    }

    @RequestMapping(value = "/cookie2", method = RequestMethod.GET)
    public String cookie2(HttpServletResponse response) {
        Cookie cookie1 = new Cookie("aa", null);
        Cookie cookie2 = new Cookie("bb", null);
        cookie1.setMaxAge(0);
        cookie2.setMaxAge(0);

        response.addCookie(cookie1);
        response.addCookie(cookie2);

        return "redirect:/";
    }

    @RequestMapping(value = "/cookie3", method = RequestMethod.GET)
    public String cookie3(HttpServletResponse response, HttpServletRequest request) {
        Cookie[] cks = request.getCookies();

        for (Cookie ck : cks) {
            System.out.println("이름 : " + ck.getName() +
                    "\n 값 : " + ck.getValue());
        }

        return "redirect:/";
    }

    public String cookie4(
            @CookieValue(value = "aa", defaultValue = "none") String aa,
            @CookieValue(value = "bb", defaultValue = "0") String bb){
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);

        return "redirect:/";
    }
}
