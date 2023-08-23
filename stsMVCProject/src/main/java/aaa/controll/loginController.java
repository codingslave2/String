package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
    @GetMapping("/loginPage")
    public String showLoginPage() {
        return "loginPage"; // 로그인 페이지 템플릿
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // 예시: 로그인 로직
        if (isValidUser(username, password)) { // isValidUser 메서드는 실제 로그인 검증 로직을 구현해야 함
            return "redirect:/session/loginSuccess";
        } else {
            return "redirect:/loginPage";
        }
    }
    
    // 실제로는 데이터베이스나 사용자 정보와 비교해야 할 로직이 여기에 들어가야 합니다.
    private boolean isValidUser(String username, String password) {
        // 예시: 더미 사용자 정보
        return username.equals("validUsername") && password.equals("validPassword");
    }
	
}
