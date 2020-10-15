public class studentRecord {
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int midterm;
    private int finalExam;
    //private int final_grade;

    public studentRecord(int q1 , int q2 , int q3 , int mt , int ovrlScr){
        midterm = mt;
        finalExam = ovrlScr;
        if(q1 > 100 || q1 < 0){
            System.out.println("Invalid input score : must be between 0 to 100");
            return;
        }
        else {
            quiz1 = q1;
        }

        if(q2 > 100 || q2 < 0){
            System.out.println("Invalid input score : must be between 0 to 100");
            return;
        }
        else {
            quiz2 = q2;
        }

        if(q3 > 100 || q3 < 0){
            System.out.println("Invalid input score : must be between 0 to 100");
            return;
        }
        else {
            quiz3 = q3;
        }

        if(mt > 100 || mt < 0){
            System.out.println("Invalid input score : must be between 0 to 100");
            return;
        }
        else {
            midterm = mt;
        }

        if(ovrlScr > 100 || ovrlScr < 0){
            System.out.println("Invalid final score : must be between 0 to 100");
            return;
        }
        else {
            finalExam = ovrlScr;
        }

    }

    public double getQuizScore(){
        double overallQuizScore = ((quiz1 + quiz2 + quiz3) / 3) * 0.25; // final quiz score will weigh to 25%
        return overallQuizScore;
    }

    public double getMidtermScore(){
        return midterm * 0.35;  // midterm score will weigh to 35% of final score
    }

    @Override
    public String toString() {
        double numericGrade = getFinalGrade();
        return "studentRecord{" +
                "quiz1=" + quiz1 +
                ", quiz2=" + quiz2 +
                ", quiz3=" + quiz3 +
                ", midterm=" + midterm +
                ", finalExam=" + finalExam +
                ", Numeric Grade=" + numericGrade+
                '}';
    }

    public double getFinalExamScore(){
        return finalExam * 0.4;
    }

    public double getFinalGrade(){
        return getQuizScore() + getMidtermScore() + getFinalExamScore();
    }
}
