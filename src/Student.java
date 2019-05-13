
public class Student {


    public void StudentInfo(String aStudentNo, int Com_Score, int Eng_Score) { //Extract Method
        //Replace Method with Method Object
        char temp; //Split Temporary Variable
        double avg;

        if(Com_Score >= 90 ) {
            temp = 'A';
        }
        else if (Com_Score >= 80) {
            temp = 'B';
        }
        else if (Com_Score >= 70 ) {
            temp = 'C';
        }
        else if (Com_Score >= 60 ) {
            temp = 'D';
        }
        else {
            temp = 'F';
        }
        System.out.println("studentNo : " + aStudentNo);
        System.out.println("Computer Score : " + Com_Score);
        System.out.println("Computer Grade : " + temp);

        if(Eng_Score >= 90 ) {
            temp = 'A';
        }
        else if (Eng_Score >= 80) {
            temp = 'B';
        }
        else if (Eng_Score >= 70 ) {
            temp = 'C';
        }
        else if (Eng_Score >= 60 ) {
            temp = 'D';
        }
        else {
            temp = 'F';
        }

        avg = (double) (Com_Score + Eng_Score)/2;

        System.out.println("English Score : " + Eng_Score);
        System.out.println("English Grade : " + temp);
        System.out.println("Average : " + avg);

    }

    public static void main(String[] args){
        Student student = new Student();
        student.StudentInfo("1234",100,85);
    }

}
