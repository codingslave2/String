package aop_p.Score;

public class ScoreServiceImpt implements ScoreService{

	@Override
	public int getScore(String StudentName) {

		if("일".equals(StudentName))
            return 0;
        else if("이".equals(StudentName))
            return 100;
        else if("삼".equals(StudentName))
            return 99;
        else if("사".equals(StudentName))
            return 98;
        else if("오".equals(StudentName))
            return 97;
        else if("육".equals(StudentName))
            return 96;
        else if("칠".equals(StudentName))
            return 95;

		return 0;
	}

	

}
