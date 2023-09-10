public class Policy {
   // Field Declaration
   private int policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String policyholderSmokingStatus;
   private double policyholderHeight;
   private double policyholderWeight;
   
   // Constructors
   public Policy() {
      policyNumber = 1234;
      providerName = "State Farm";
      policyholderFirstName = "John";
      policyholderLastName = "Doe";
      policyholderAge = 24;
      policyholderSmokingStatus = "non-smoker";
      policyholderHeight = 62.0;
      policyholderWeight = 250.5;
   }
   
   public Policy(int num, String name, String fname, String lname, int age, String smokingStatus, double height, double weight) {
      policyNumber = num;
      providerName = name;
      policyholderFirstName = fname;
      policyholderLastName = lname;
      policyholderAge = age;
      policyholderSmokingStatus = smokingStatus;
      policyholderHeight = height;
      policyholderWeight = weight;
   }
   
   // Accessor Methods
   public int getPolicyNumber() {
      return policyNumber;
   }
   
   public String getProviderName() {
      return providerName;
   }
   
   public String getPolicyholderFirstName() {
      return policyholderFirstName;
   }
   
   public String getPolicyholderLastName() {
      return policyholderLastName;
   }
   
   public int getPolicyholderAge() {
      return policyholderAge;
   }
   
   public String getPolicyholderSmokingStatus() {
      return policyholderSmokingStatus;
   }
   
   public double getPolicyholderHeight() {
      return policyholderHeight;
   }
   
   public double getPolicyholderWeight() {
      return policyholderWeight;
   }
   
   // Mutator methods
   
   public void setPolicyNumber(int num) {
      policyNumber = num;
   }
   
   public void setProviderName(String name) {
      providerName = name;
   }
   
   public void setPolicyholderFirstName(String fname) {
      policyholderFirstName = fname;
   }
   
   public void setPolicyholderLastName(String lname) {
      policyholderLastName = lname;
   }
   
   public void setPolicyholderAge(int age) {
      policyholderAge = age;
   }
   
   public void setPolicyholderSmokingStatus(String smokingStatus) {
      policyholderSmokingStatus = smokingStatus;
   }
   
   public void setPolicyholderHeight(double height) {
      policyholderHeight = height;
   }
   
   public void setPolicyholderWeight(double weight) {
      policyholderWeight = weight;
   }
   
   // Other methods
   
   public double policyholderBMI() {
      double bmi = (policyholderWeight * 703) / Math.pow(policyholderHeight, 2);
      return bmi;
   }
   
   public double calculatePrice() {
      double fee = 600.00;
      
      if (policyholderAge > 50) {
         fee += 75;
      }
      
      if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) {
         fee += 100;
      }
      
      if (policyholderBMI() > 35) {
         fee += (policyholderBMI() - 35) * 20;
      }
      
      return fee;
   }
}