public class StudentResults {
    public String studentResultsGrade(int result){
        String grade = null;
        if (result < 0){
            throw new IllegalArgumentException("Out of range!");
        }
        else if (result < 40){
            grade = "Fail";
        }
        else if (result < 50){
            grade = "Pass";
        }
        else if (result < 60){
            grade = "Merit";
        }
        else {
            grade = "Distinction";
        }
        return grade;
    }

}
