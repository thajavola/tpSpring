package cdan4.tp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@SpringBootApplication


public class TpStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpStringApplication.class, args);
	}

	@GetMapping("/fary")
	 String hello() {
	return "index";
}

        @PostMapping("/post")
    
    String bonjour(){
            return "ouiiii";        }
}



