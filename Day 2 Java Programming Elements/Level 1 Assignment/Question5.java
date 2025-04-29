public class Question5 {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int qop = pens / students;
        int rem = pens % students;
        System.out.println("The pen per student is " + qop + " and the remaining pen not distributed is " + rem);
    }
}
