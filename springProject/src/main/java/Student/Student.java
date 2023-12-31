package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    
	String name;
	String subjects;
	int total, avg, rank;
	List<Integer> scores = new ArrayList<>();

	

	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubjects() {
		System.out.println("과목: ");
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public List<Integer> getScores() {		
		return scores;
	}
	
	public void setScores(List<Integer> scores) {
		this.scores = scores; // 점수 리스트 생성
		total = 0; // 점수 초기화
		for(int i : scores) {
			total += i; // 점수 리스트의 총점 구하기
		}
		if(scores.size() > 0) { // 과목 점수의 총량 구하기
			avg = total / scores.size(); // 만약 과목 점수의 총량이 0보다 크면 계산 가능
		}


	}

	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		
	}

	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {		
		this.avg = avg;
		
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {		
		this.rank = rank;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", subjects=" + subjects + ", scores=" + scores + "]";
	}

	
	
	


}
