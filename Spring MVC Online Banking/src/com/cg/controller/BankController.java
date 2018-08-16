package com.cg.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.service.BankService;
import com.cg.service.BankServiceImpl;

@Controller
public class BankController {
	
	BankService service = new BankServiceImpl();
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/withdrawForm")
	   public String withdrawForm() {
		return "withdrawForm";
	}
	
	@RequestMapping("/result")
	  public String withdraw(@RequestParam("accountNumber") String accountNumber,@RequestParam("amount") String amount, Model model) {
		int accNo = (int) service.withdraw(Integer.parseInt(accountNumber),Integer.parseInt(amount));
		model.addAttribute("Balance",accNo);
		return "result";
	}
}
