package in.avalara;

public class CalcServiceImpl implements CalcServiceIntf {

	@Override
	public String calcGrade(float marks) {
		if (marks > 100 || marks < 0) {
			return "I";
		}
		else if (marks >= 70) {
			return "A";
		} else if (marks >= 60) {
			return "B";
		} else if (marks >= 40) {
			return "C";
		} else {
			return "F";
		}
	}

}
