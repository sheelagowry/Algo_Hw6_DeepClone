package h6;


//Test 1 Patients Database

//implements Cloneable is just a marker interface to let the Object.clone() method know that it must not throw an exception when called.
	class MedicalTest implements Cloneable{
		
		String MTest1; //MTest refers to  MedicalTest
		String MTest2;
		String MTest3;
		
		//MedicalTest constructor
		public MedicalTest(String MT1, String MT2, String MT3){
			
			this.MTest1 = MT1;
			this.MTest2 = MT2;
			this.MTest3 = MT3;
		}
		
		protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }

	}

 class Patient implements Cloneable{
	
	 int id;
	 int age;
	 String name;
	 MedicalTest medicaltest;
	 
	 public Patient (int id, int age, String name, MedicalTest medicaltest ){
		 
		 this.id = id;
		 this.age = age;
		 this.name = name;
		 this.medicaltest = medicaltest;
	 }
	 
	 //Overriding clone() method to create a deep copy of an object.
	 protected Object clone() throws CloneNotSupportedException
	    {
	        Patient patient = (Patient) super.clone();
	 
	        patient.medicaltest = (MedicalTest) medicaltest.clone();
	 
	        return patient;
	    }

	
}
public class Deepclone {
	 public static void main(String[] args) throws CloneNotSupportedException{
		 MedicalTest tests = new MedicalTest("UltraSound", "Echo cardiogram", "X-ray");
		 Patient patient = new Patient(1112, 35, "Enriko", tests);
	     System.out.println("Output test:1, Patient DB");
		
	     //original
		 System.out.println("Original object:" + " " + "Name:" + " " + patient.name + ", " + "Age:" + " " + patient.age + ", " + "ID:" + " " + patient.id + ", " + "MedicalTests:" + " " + patient.medicaltest.MTest1 + ", " + patient.medicaltest.MTest2 + ", " + patient.medicaltest.MTest3 );
		
		 //cloned // a clone of Patients and assigning it to clonedpatient
		 Patient  clonedpatient = (Patient) patient.clone();
		 
		 System.out.println("Cloned object:" + " " + "Name:" + " " + clonedpatient.name + ", " + "Age:" + " " + clonedpatient.age + ", " + "ID:" + " " + clonedpatient.id + ", " + "MedicalTest:" + " " + clonedpatient.medicaltest.MTest1 + ", " + clonedpatient.medicaltest.MTest2 + ", " + clonedpatient.medicaltest.MTest3 );
	 
		 //updated the name of the patient and also the medicaltest , Surname is updated and Echo cardiogram is updated to Blood test
		 
		 patient.name = "Enriko john";
		 patient.medicaltest.MTest2 = "Blood test";
		
		 System.out.println("updated object:" + " " + "Name:" + " " + patient.name + ", " + "Age:" + " " + patient.age + ", " + "ID:" + " " + patient.id + ", " + "MedicalTests:" + " " + patient.medicaltest.MTest1 + ", " + patient.medicaltest.MTest2 + ", " + patient.medicaltest.MTest3 );

		 System.out.println("Cloned Object after updating original object:" + " " + "Name:" + " " + clonedpatient.name + ", " + "Age:" + " " + clonedpatient.age + ", " + "ID:" + " " + clonedpatient.id + ", " + "MedicalTest:" + " " + clonedpatient.medicaltest.MTest1 + ", " + clonedpatient.medicaltest.MTest2 + ", " + clonedpatient.medicaltest.MTest3 );

		 String newLine = System.getProperty("line.separator"); // this is to seperate line

	     System.out.println(" " + newLine + " "); // print newline 
		 
		 DeptSurveyClone.main(args); // this is to print another main method..here it printsthe main method of "DeptSurveyClone"
		 CloningPersonWorkExperience.main(args);
		 CloneChild .main(args);
	 
	 }
	 
	 
	 
	
 } 
 
 ////////////////////////
 
 //Test 2: College Department Survey 
 
 class DepartmentSurvey implements Cloneable{
	
	
	 String UniversityName; //University name
	 String DeptName; // dpt name
	 int SurveyYear; //survey year
	 int NoOfStudents; // no of students
	 int NoOfCourse; //no of course
	 
	 public DepartmentSurvey (String UniversityName, String DeptName, int SurveyYear, int NoOfStudents, int NoOfCourse  ){
		 
		 this.UniversityName = UniversityName;
		 this.DeptName = DeptName;
		 this.SurveyYear = SurveyYear;
		 this.NoOfStudents = NoOfStudents;
		 this.NoOfCourse = NoOfCourse;
		 
	 }
	 protected Object clone() throws CloneNotSupportedException
	    {
	 
		  return super.clone();
	    }
	 
	 
	 
 }
 
  class DeptSurveyClone {
	 public static void main(String[] args) throws CloneNotSupportedException{
		 DepartmentSurvey DptSurvey = new DepartmentSurvey ("Tallinn University", "IT-deptartment", 2015, 1000, 50);
		
	     System.out.println("Output test:2, College Department Survey");
		
	     //original
		 System.out.println("Original object:" + " " + "UniversityName:" + " " + DptSurvey.UniversityName + ", " + "DepartmentName:" + " " + DptSurvey.DeptName + ", " + "SurveyYear:" + " " + DptSurvey.SurveyYear + ", " + "No Of Students:" + " " + DptSurvey.NoOfStudents + ", " + "No Of Course:" + " " + DptSurvey.NoOfCourse );
		
		 //cloned // a clone of Patients and assigning it to clonedpatient
		 DepartmentSurvey  clonedDepartmentSurvey = (DepartmentSurvey) DptSurvey.clone();
		 
		 System.out.println("Cloned object:" + " " + "UniversityName:" + " " + clonedDepartmentSurvey.UniversityName + ", " + "DepartmentName:" + " " + clonedDepartmentSurvey.DeptName + ", " + "SurveyYear:" + " " + clonedDepartmentSurvey.SurveyYear + ", " + "No Of Students:" + " " + clonedDepartmentSurvey.NoOfStudents + ", " + "No Of Course:" + " " + clonedDepartmentSurvey.NoOfCourse );
	 
		 //updated the name of the patient and also the medicaltest , Surname is updated and Echo cardiogram is updated to Blood test
		 
		 DptSurvey.SurveyYear = 2016;
		 DptSurvey.NoOfStudents = 2000;
		 DptSurvey.NoOfCourse = 100;
		
		 System.out.println("Updated object:" + " " + "UniversityName:" + " " + DptSurvey.UniversityName + ", " + "DepartmentName:" + " " + DptSurvey.DeptName + ", " + "SurveyYear:" + " " + DptSurvey.SurveyYear + ", " + "No Of Students:" + " " + DptSurvey.NoOfStudents + ", " + "No Of Course:" + " " + DptSurvey.NoOfCourse );

		 System.out.println("Cloned Object after updating original object:" + " " + "UniversityName:" + " " + clonedDepartmentSurvey.UniversityName + ", " + "DepartmentName:" + " " + clonedDepartmentSurvey.DeptName + ", " + "SurveyYear:" + " " + clonedDepartmentSurvey.SurveyYear + ", " + "No Of Students:" + " " + clonedDepartmentSurvey.NoOfStudents + ", " + "No Of Course:" + " " + clonedDepartmentSurvey.NoOfCourse );

		 
		 String newLine = System.getProperty("line.separator"); // this is to seperate line

	     System.out.println(" " + newLine + " "); // print newline s
	 }
	 
	
 } 

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  //Test: 3 Person work experience.
  
  class PersonWorkExperience implements Cloneable{
		
		
		 String PersonName; 
		 String OfficeName; 
         String Workposition;
		 int PersonID; 
		 int WorkPeriod; 
		 int AnnualSalary;
		 
		 public PersonWorkExperience (String PersonName, String OfficeName, String Workposition, int PersonID, int WorkPeriod, int AnnualSalary ){
			 
			 this.PersonName = PersonName;
			 this.OfficeName = OfficeName;
			 this.Workposition = Workposition;
			 this.PersonID = PersonID;
			 this.WorkPeriod = WorkPeriod;
			 this.AnnualSalary = AnnualSalary;
			 
		 }
		 	 	 
		 protected Object clone() throws CloneNotSupportedException
		    {
		 
			  return super.clone();
		    }
		 
  }
   class CloningPersonWorkExperience {
	  public static void main(String args[]) throws CloneNotSupportedException{
		  PersonWorkExperience personworkexp =new PersonWorkExperience("Ram","SwedBank", "Analyst", 1462, 2, 1000);
	     
		     System.out.println("Output test:3, Persons WORK Experience");
		     
			 System.out.println("Original object:" + " " + "Person Name:" + " " + personworkexp.PersonName + ", " + "ID:" + " " + personworkexp.PersonID + ", " + " OfficeName:" + " " + personworkexp.OfficeName + ", " + "Work Position:" + " " + personworkexp.Workposition + ", " + "Work, Years of Experience:" + " " + personworkexp.WorkPeriod + ", " + "Annual Salary in EUR:" + " " + personworkexp.AnnualSalary );

		     //clone object
		     PersonWorkExperience  clonedPersonWorkExperience = (PersonWorkExperience) personworkexp.clone();

			 System.out.println("Cloned object:" + " " + "Person Name:" + " " + clonedPersonWorkExperience.PersonName + ", " + "ID:" + " " + clonedPersonWorkExperience.PersonID + ", " + " OfficeName:" + " " + clonedPersonWorkExperience.OfficeName + ", " + "Work Position:" + " " + clonedPersonWorkExperience.Workposition + ", " + "Work, Years of Experience:" + " " + clonedPersonWorkExperience.WorkPeriod + ", " + "Annual Salary in EUR:" + " " + clonedPersonWorkExperience.AnnualSalary );
     
	    // update
			 personworkexp.Workposition = "Product Manager";
			 personworkexp.WorkPeriod = 4;
			 personworkexp.AnnualSalary = 2000;
			 
			 System.out.println("Updated object:" + " " + "Person Name:" + " " + personworkexp.PersonName + ", " + "ID:" + " " + personworkexp.PersonID + ", " + " OfficeName:" + " " + personworkexp.OfficeName + ", " + "Work Position:" + " " + personworkexp.Workposition + ", " + "Work, Years of Experience:" + " " + personworkexp.WorkPeriod + ", " + "Annual Salary in EUR:" + " " + personworkexp.AnnualSalary );

			 System.out.println("Cloned Object after updating original object:" + " " + "Person Name:" + " " + clonedPersonWorkExperience.PersonName + ", " + "ID:" + " " + clonedPersonWorkExperience.PersonID + ", " + " OfficeName:" + " " + clonedPersonWorkExperience.OfficeName + ", " + "Work Position:" + " " + clonedPersonWorkExperience.Workposition + ", " + "Work, Years of Experience:" + " " + clonedPersonWorkExperience.WorkPeriod + ", " + "Annual Salary in EUR:" + " " + clonedPersonWorkExperience.AnnualSalary );

			 String newLine = System.getProperty("line.separator"); // this is to seperate line

		     System.out.println(" " + newLine + " "); // print newline 
	  }
	}
  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   //Test 4: Sibilings BMI(Body mass index) details
   
   //Child1
   
   class Child1 implements Cloneable{
		
		String Name; 
		int Age;
		int Height;
		int Weight;
		int BMI;
		
		//MedicalTest constructor
		public Child1 (String Name, int Age, int Height, int Weight, int BMI){
			
			this.Name = Name;
			this.Age = Age;
			this.Height = Height;
			this.Weight = Weight;
			this.BMI = BMI;
		}
		
		protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }

	}
   class Child2 implements Cloneable{
		
	   String Name; 
		int Age;
		int Height;
		int Weight;
		int BMI;
		
		//MedicalTest constructor
		public Child2 (String Name, int Age, int Height, int Weight, int BMI){
			
			this.Name = Name;
			this.Age = Age;
			this.Height = Height;
			this.Weight = Weight;
			this.BMI = BMI;
		}
		 
		 //Overriding clone() method to create a deep copy of an object.
		 protected Object clone() throws CloneNotSupportedException
		    {
			 return super.clone();
		 
		    }
		 		
	}
   
   class CloneChild {
		  public static void main(String args[]) throws CloneNotSupportedException{
			  
			  Child1 child1 = new Child1 ("Uku",5 , 109, 19, 16);
			  Child2 child2 = new Child2 ("Elora", 3, 93, 14, 13);
			  
			  System.out.println("Output test:4, Sibilings BMI details");
			     
			  //original
				 System.out.println("Original object of Child1:" + " " + "Child1 Name:" + " " + child1.Name + ", " + "Child1 Age:" + " " + child1.Age + ", " + " Child1 Height in CM:" + " " + child1.Height + ", " + "Child1 Weight in kg:" + " " + child1.Weight + ", " + "Child1 BMI:" + " " + child1.BMI );
				 System.out.println("Original object of Child2:" + " " + "Child2 Name:" + " " + child2.Name + ", " + "Child2 Age:" + " " + child2.Age + ", " + " Child2 Height in CM:" + " " + child2.Height + ", " + "Child2 Weight in kg:" + " " + child2.Weight + ", " + "Child2 BMI:" + " " + child2.BMI );

             //Clone 
			     Child1  clonedChild1 = (Child1) child1.clone();
			     Child2  clonedChild2 = (Child2) child2.clone();
			     
			     System.out.println("Cloned object of Child1:" + " " + "Child1 Name:" + " " + clonedChild1.Name + ", " + "Child1 Age:" + " " + clonedChild1.Age + ", " + " Child1 Height in CM:" + " " + clonedChild1.Height + ", " + "Child1 Weight in kg:" + " " + clonedChild1.Weight + ", " + "Child1 BMI:" + " " + clonedChild1.BMI );
				 System.out.println("Cloned object of Child2:" + " " + "Child2 Name:" + " " + clonedChild2.Name + ", " + "Child2 Age:" + " " + clonedChild2.Age + ", " + " Child2 Height in CM:" + " " + clonedChild2.Height + ", " + "Child2 Weight in kg:" + " " + clonedChild2.Weight + ", " + "Child2 BMI:" + " " + clonedChild2.BMI );
				 
			//update child 1
				 child1.Age = 10;
				 child1.Height = 137;
				 child1.Weight = 31;
				 child1.BMI = 17;
				 
		  // update child 2
				 
				 child2.Age = 8;
				 child2.Height = 127;
				 child2.Weight = 25;
				 child2.BMI = 16;
				 
		  //Updated
				 System.out.println("Updated object of Child1:" + " " + "Child1 Name:" + " " + child1.Name + ", " + "Child1 Age:" + " " + child1.Age + ", " + " Child1 Height in CM:" + " " + child1.Height + ", " + "Child1 Weight in kg:" + " " + child1.Weight + ", " + "Child1 BMI:" + " " + child1.BMI );
				 System.out.println("Updated object of Child2:" + " " + "Child2 Name:" + " " + child2.Name + ", " + "Child2 Age:" + " " + child2.Age + ", " + " Child2 Height in CM:" + " " + child2.Height + ", " + "Child2 Weight in kg:" + " " + child2.Weight + ", " + "Child2 BMI:" + " " + child2.BMI );

        // cloned after updated
				 System.out.println("Cloned Object after updating original object of Child1:" + " " + "Child1 Name:" + " " + clonedChild1.Name + ", " + "Child1 Age:" + " " + clonedChild1.Age + ", " + " Child1 Height in CM:" + " " + clonedChild1.Height + ", " + "Child1 Weight in kg:" + " " + clonedChild1.Weight + ", " + "Child1 BMI:" + " " + clonedChild1.BMI );
				 System.out.println("Cloned Object after updating original object of Child2:" + " " + "Child2 Name:" + " " + clonedChild2.Name + ", " + "Child2 Age:" + " " + clonedChild2.Age + ", " + " Child2 Height in CM:" + " " + clonedChild2.Height + ", " + "Child2 Weight in kg:" + " " + clonedChild2.Weight + ", " + "Child2 BMI:" + " " + clonedChild2.BMI );
		
		// for free space
				 String newLine = System.getProperty("line.separator"); // this is to seperate line
			     System.out.println(" " + newLine + " "); // print newline 

			     

				 
				
			  
		  }
   }

 