import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;

@Controller
public class MultiController {

    @Autowired
    private MultiService multiService;

    @GetMapping("/multiply")
    public String multiply(Model model) {
        int num1 = 5;
        int num2 = 6;
        int result = multiService.multiply(num1, num2);
        model.addAttribute("result", result);
        return "multi"; 
    }
}
