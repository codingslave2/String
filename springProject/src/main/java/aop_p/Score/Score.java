package aop_p.Score;

public class Score {
	
	String name;
	int total, avg;
	
	public void setScore(int kor, int eng) {
		total = kor + eng;
		avg = total / 2;
	}

	public void setScore(int kor, int eng, int math) {
		total = kor + eng + math;
        avg = total / 3;
	}

	public void setScore(int kor, int eng,  int math, int sci) {
        total = kor + eng + math + sci;
        avg = total / 4;
    }

	@Override
	public String toString() {
		return "Score [name=" + name + ", total=" + total + ", avg=" + avg + "]";
	}	
		
}
