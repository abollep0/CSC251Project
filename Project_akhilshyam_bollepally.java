import java.util.*;
import java.io.*;

public class Project_akhilshyam_bollepally {
   public static void main(String[] args) throws IOException {
      ArrayList<Policy> people = new ArrayList<>(); // Creating an ArrayList for Policy Objects
      File policyInformation = new File("PolicyInformation.txt"); // For reading the file PolicyInformation
      Scanner informationList = new Scanner(policyInformation); // Importing for reading txt file
      
      ArrayList<Integer> nums = new ArrayList<>();
      ArrayList<String> names = new ArrayList<>();
      ArrayList<String> fnames = new ArrayList<>();
      ArrayList<String> lnames = new ArrayList<>();
      ArrayList<Integer> ages = new ArrayList<>();
      ArrayList<String> smokingStatuses = new ArrayList<>();
      ArrayList<Double> heights = new ArrayList<>();
      ArrayList<Double> weights = new ArrayList<>();
      
      while (informationList.hasNext()) {
         nums.add(informationList.nextInt());
         names.add(informationList.nextLine());
         fnames.add(informationList.nextLine());
         lnames.add(informationList.nextLine());
         ages.add(informationList.nextInt());
         smokingStatuses.add(informationList.nextLine());
         heights.add(informationList.nextDouble());
         weights.add(informationList.nextDouble());
         informationList.nextLine();
      }
      /*
      System.out.printf("Policy Number: %d\n\nProvider Name: %s\n\nPolicyholder’s First Name: %s\n\nPolicyholder’s Last Name: %s\n\nPolicyholder’s Age: %d", num,name,fname,lname,age);
      System.out.printf("\n\nPolicyholder’s Height: %.1f\n\nPolicyholder’s Weight: %.1f\n\nPolicyholder’s BMI: %.2f\n\nPolicy Price: $%,.2f",height,weight,person.policyholderBMI(),person.calculatePrice());
      */
   }
}