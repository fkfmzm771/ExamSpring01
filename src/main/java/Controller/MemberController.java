package Controller;

import VO.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 회원가입, 특정회원 보기, 회원목록 보기, 회원지정 삭제
 *
 *
 */

@Controller
public class MemberController {

    @RequestMapping(value = "joinForm", method = RequestMethod.GET)
    public String viewJoinForm(){
        return "JoinForm";
    }


    @RequestMapping(value = "joinForm", method = RequestMethod.POST)
    public String join(){
        return "redirect:/";
    }

    //회원정보 보기
    @RequestMapping(value = "info", method = RequestMethod.POST)
    public String info(String id, Model model){

        Member member = null;

        model.addAttribute("member", member);


        return "info";
    }

    //회원목록
    @RequestMapping(value = "list", method = RequestMethod.POST)
    public String list(Model model){
        List<Member> list = null;

        model.addAttribute("list", list);
        return "info";
    }

    //회원목록
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String delete(String id){

        int result = 0;


        return "redirect:/";
    }

}
