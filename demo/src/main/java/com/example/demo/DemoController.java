package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RestController;

//@RestControllerを記述することで、このクラスがWEBアプリケーションとして
//操作できるコントローラプログラムとして動作できるようになります。
//@RestController

@Controller
public class DemoController {
//	@RequestMappingは、リクエストを受けたときの処理を記述します。
//	このプログラムの場合、"/"（ルート）にアクセスが来た場合の処理です。
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
//	Modelクラスとは、Webページで使用するデータを管理するクラスです。
	@RequestMapping("/{num}")
	public String index(@PathVariable int num, Model model) {
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
////		addAttributeは、第一引数で名前を、第二引数で値を設定します。
////		ビュー側で第一引数で指定した名前でデータを取り出します
		model.addAttribute("msg", "sum=" + sum);
		return "index";
	}
	
//	String home() {
//		return "Hello World2!";
//	}
//	@RequestMapping("/user")
//	String user() {
//		return "Welcome user!";
//	}
}
