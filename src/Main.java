public class Main {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("You passed Congratulations");
                break;
            case 'F':
                System.out.println("You Failed");
                break;
            default:
                System.out.println("invalid note!!!");

        }
    }
}