
public class Student {


    public void StudentInfo(String aStudentNo, int Com_Score, int Eng_Score) {
        char Com_grade;
        char Eng_grade;
        double avg;

        if(Com_Score >= 90 ) {
            Com_grade = 'A';
        }
        else if (Com_Score >= 80) {
            Com_grade = 'B';
        }
        else if (Com_Score >= 70 ) {
            Com_grade = 'C';
        }
        else if (Com_Score >= 60 ) {
            Com_grade = 'D';
        }
        else {
            Com_grade = 'F';
        }

        if(Eng_Score >= 90 ) {
            Eng_grade = 'A';
        }
        else if (Eng_Score >= 80) {
            Eng_grade = 'B';
        }
        else if (Eng_Score >= 70 ) {
            Eng_grade = 'C';
        }
        else if (Eng_Score >= 60 ) {
            Eng_grade = 'D';
        }
        else {
            Eng_grade = 'F';
        }

        avg = (double) (Com_Score + Eng_Score)/2;

        System.out.println("studentNo : " + aStudentNo);
        System.out.println("Computer Score : " + Com_Score);
        System.out.println("Computer Grade : " + Com_grade);
        System.out.println("English Score : " + Eng_Score);
        System.out.println("English Grade : " + Eng_grade);
        System.out.println("Average : " + avg);

    }

    public static void main(String[] args){
        Student student = new Student();
        student.StudentInfo("1234",100,85);
    }

}
