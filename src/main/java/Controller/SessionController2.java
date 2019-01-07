package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

// 어노테이션을 이용한 세션 사용
@Controller
@SessionAttributes({"data1", "data2"})
public class SessionController2 {
    //첫번째 단계
    @RequestMapping(value="/step1", method=RequestMethod.GET)
    public String step1() {
        return "step";
    }
    // 세션에 값을 저장
    @RequestMapping(value="/step2", method=RequestMethod.GET)
    public String step2(Model model) {
        model.addAttribute("data1", "step2에서 모델에 저장한 value2");
        return "step";
    }
    // 세션에 값을 추가로 저장
    @RequestMapping(value="/step3", method=RequestMethod.GET)
    public String step3(
            @ModelAttribute("data1") String data1,
            Model model) {
        model.addAttribute("data2", "step3에서 모델에 저장한 value3");
        return "step";
    }
    // 프로세스의 마지막단계에서 세션에 저장된 값들을 지운다.
    @RequestMapping(value="/end", method=RequestMethod.GET)
    public String end(
            @ModelAttribute("data1") String data1,
            @ModelAttribute("data2") String data2,
            SessionStatus sessionStatus
    ) {
        // 세션의 값 삭제
        sessionStatus.setComplete();
        return "end";
    }
}