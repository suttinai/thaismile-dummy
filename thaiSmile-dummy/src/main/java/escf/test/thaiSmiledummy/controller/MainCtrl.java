package escf.test.thaiSmiledummy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class MainCtrl {
	private String appMode;

	@Autowired
	public MainCtrl(Environment environment) {
		appMode = environment.getProperty("app-mode");
	}

	@RequestMapping("/")
	public String index(Model model) {
		

		return service1(model);
	}
	
	@RequestMapping("/service1")
	public String service1(Model model) {
		

		return "service1";
	}
	
	@RequestMapping("/service2")
	public String service2(Model model) {
		

		return "service2";
	}
	@RequestMapping("/service3")
	public String service3(Model model) {
		

		return "service3";
	}
}
