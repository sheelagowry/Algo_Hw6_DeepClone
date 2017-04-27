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
		 //DepartmentSurvey DptSurvey  = (DepartmentSurvey) super.clone();
	 
		  return super.clone();
	    }
	 
	 
	 
 }
 
  class DeptSurveyClone {
	 public static void main(String[] args) throws CloneNotSupportedException{
		 DepartmentSurvey DptSurvey = new DepartmentSurvey ("Tallinn University", "IT-deptartment", 2015, 1000, 50);
		// Patient patient = new Patient(1112, 35, "Enriko", tests);
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

		 System.out.println("Cloned object:" + " " + "UniversityName:" + " " + clonedDepartmentSurvey.UniversityName + ", " + "DepartmentName:" + " " + clonedDepartmentSurvey.DeptName + ", " + "SurveyYear:" + " " + clonedDepartmentSurvey.SurveyYear + ", " + "No Of Students:" + " " + clonedDepartmentSurvey.NoOfStudents + ", " + "No Of Course:" + " " + clonedDepartmentSurvey.NoOfCourse );

	 }
	 
	
 } 

 
  


 