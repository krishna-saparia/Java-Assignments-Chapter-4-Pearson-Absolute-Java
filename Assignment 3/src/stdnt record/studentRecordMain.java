import java.util.Scanner;

public class studentRecordMain {
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);

        System.out.println("Put first quiz score : ");
        int q1_scr = s1.nextInt();

        System.out.println("Put Second quiz score : ");
        int q2_scr = s1.nextInt();

        System.out.println("Put third quiz score : ");
        int q3_scr = s1.nextInt();

        System.out.println("Put mid term score : ");
        int mid_score = s1.nextInt();

        System.out.println("Put final exam score : ");
        int fExm_score = s1.nextInt();

        studentRecord sr1 = new studentRecord(q1_scr , q2_scr , q3_scr , mid_score , fExm_score);
        System.out.println();
        System.out.println(sr1);
    }
}
