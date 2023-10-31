public class PolicyHolder {
   private String firstname;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   public PolicyHolder(String firstName,String lastName,int age,String smokingStatus,double height,double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   public PolicyHolder(PolicyHolder object) {
      firstName = object.getFirstName();
      lastName = object.getLastName();
      age = object.getAge();
      smokingStatus = object.getSmokingStatus();
      height = object.getHeight();
      weight = object.getWeight();
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public String getName() {
      return firstName + " " + lastName;
   }
   
   public int getAge() {
      return age;
   }
   
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   public double getHeight() {
      return height;
   }
   
   public double getWeight() {
      return weight;
   }
   
   public String toString(PolicyHolder object) {
      
   }
}