import java.util.Scanner;

public class FormLetterWriter {
        public static void main(String[] args)
        {
            displaySalutation("jack");
            displaySalutation("Mark", "Marl");
            System.out.print("Thank you for your recent order");
        }
        public static void displaySalutation(String L_name)
        {
            System.out.println("Dear Mr. or Ms. " + L_name);
        }
        public static void displaySalutation(String F_name, String L_name)
        {
            System.out.println("Dear " + F_name + " " + L_name);
        }
}
