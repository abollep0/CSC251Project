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
         informationList.nextLine();
         names.add(informationList.nextLine());
         fnames.add(informationList.nextLine());
         lnames.add(informationList.nextLine());
         ages.add(informationList.nextInt());
         informationList.nextLine();
         smokingStatuses.add(informationList.nextLine());
         heights.add(informationList.nextDouble());
         weights.add(informationList.nextDouble());
         if (informationList.hasNext()) {
            informationList.nextLine();
         } if (informationList.hasNext()) {
            informationList.nextLine();
         }
      }
      
      for (int i = 0;i < nums.size();i++) {
         people.add(new Policy(nums.get(i),names.get(i),fnames.get(i),lnames.get(i),ages.get(i),smokingStatuses.get(i),heights.get(i),weights.get(i)));
      }
      
      for (Policy person: people)
         System.out.printf("$%.2f\n",person.calculatePrice());
   }
}