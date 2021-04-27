package com.multi.kdigitalboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

		@RequestMapping("/")
		public String start() {
			return "hello";
		}
}
