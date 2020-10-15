
public class studentRecord {
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int midterm;
    private int finalExam;
    //private int final_grade;

    public studentRecord(int q1 , int q2 , int q3 , int mt , int exmScr){
        midterm = mt;
        finalExam = exmScr;
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

        if(exmScr > 100 || exmScr < 0){
            System.out.println("Invalid final score : must be between 0 to 100");
            return;
        }
        else {
            finalExam = exmScr;
        }

    }

    public double getQuizScore(){
        double overallQuizScore = ((quiz1 + quiz2 + quiz3) / 3) * 0.25; // final quiz score will weigh to 25%
        return overallQuizScore;
    }

    public double getMidtermScore(){
        return midterm * 0.35;  // midterm score will weigh to 35% of final score
    }



    public double getFinalExamScore(){
        return finalExam * 0.4;
    }

    public double getFinalGrade(){
        return getQuizScore() + getMidtermScore() + getFinalExamScore();
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
                ", Grade= " +getAlphabeticGrade(numericGrade)+
                '}';
    }

    //Set values to zero
    public void studentRecord(){
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        finalExam = 0;
    }
    public String getAlphabeticGrade(double numberedScore){

        if(numberedScore >= 90){
            return " A Grade !!!! Congrats";
        }
        else if(numberedScore < 90 && numberedScore >= 80){
            return " B Grade !!!! ";
        }
        else if(numberedScore < 80 && numberedScore >= 70){
            return " C Grade !!!!";
        }
        else if(numberedScore < 70 && numberedScore >= 60){
            return " D Grade :( ";
        }
        else {
            return " F Grade :( :(";
        }
    }
}
