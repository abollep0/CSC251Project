import java.util.Scanner;

public class Project_akhilshyam_bollepally {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      int num = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("\nPlease enter the Provider Name: ");
      String name = keyboard.nextLine();
      System.out.print("\nPlease enter the Policyholder’s First Name: ");
      String fname = keyboard.nextLine();
      System.out.print("\nPlease enter the Policyholder’s Last Name: ");
      String lname = keyboard.nextLine();
      System.out.print("\nPlease enter the Policyholder’s Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.nextLine();
      System.out.print("\nPlease enter the Policyholder’s Height (in inches): ");
      double height = keyboard.nextDouble();
      System.out.print("\nPlease enter the Policyholder’s Weight (in pounds): ");
      double weight = keyboard.nextDouble();
      
      Policy person = new Policy(num,name,fname,lname,age,smokingStatus,height,weight);
      
      System.out.printf("Policy Number: %d\n\nProvider Name: %s\n\nPolicyholder’s First Name: %s\n\nPolicyholder’s Last Name: %s\n\nPolicyholder’s Age: %d", num,name,fname,lname,age);
      System.out.printf("\n\nPolicyholder’s Height: %.1f\n\nPolicyholder’s Weight: %.1f\n\nPolicyholder’s BMI: %.2f\n\nPolicy Price: $%,.2f",height,weight,person.policyholderBMI(),person.calculatePrice());
   }
}