package boottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {

	@RequestMapping("/login")
	String index() {
		return "login";
	}
}
