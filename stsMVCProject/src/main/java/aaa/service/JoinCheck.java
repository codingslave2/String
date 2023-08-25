package aaa.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import aaa.model.JoinData;

@Service
public class JoinCheck {
	
	public boolean pwDupChk(JoinData id, BindingResult br) {
		
		System.out.println("JoinChk.poDupChk() 진입: ");
		
		br.reject("pw2", null, "암호없음");
		
		return false;
		
	}
	
}
