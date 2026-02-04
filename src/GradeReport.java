public class GradeReport {
    public  static void executeGradeReport(double score){
        if(!validateScore(score)){
            System.out.println("Invalid score");
            return;
        }
    }

    char grade = calculateLetterGrade(score);

    displayPerformanceMessage(grade);

}
