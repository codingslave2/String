package aaa.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class MemData {

	String pid = "asdf", pname="차은우", gender="여";	
	boolean mil = true;	
	String [] genders = {"남","여","it인"};
	String context = "없음";
	
	
	
	public List<MenuData> getHobbys(){
		List<MenuData> res = new ArrayList<>();
		
		res.add(new MenuData("coding","코딩하기"));
		res.add(new MenuData("study","공부하기"));
		res.add(new MenuData("debug","디버깅"));
		res.add(new MenuData("programming","프로그램만들기"));
		
		return res;
	}
	
	public List<String> getMyHobbys(){
		List<String> res = new ArrayList<>();
		
		
		res.add("study");
		res.add("programming");
		res.add("project");
		
		return res;
	}
	
	public Map<String, String> getEmail(){
		Map<String, String> res = new LinkedHashMap<>();
		
		res.put("네이버", "www.naver.com");
		res.put("구글", "www.google.com");
		res.put("다음", "www.daum.net");
		res.put("줌", "www.zum.com");
		
		return res;
	}
	
}
