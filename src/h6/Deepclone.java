package h6;

//Test 1 Patients Database - Test 1 is Patient DB, where the patient meedicaltests are stored and updated.
class MedicalTest implements Cloneable {

	String MTest1; // MTest refers to MedicalTest
	String MTest2;
	String MTest3;

	// MedicalTest constructor
	public MedicalTest(String MT1, String MT2, String MT3) {

		this.MTest1 = MT1;
		this.MTest2 = MT2;
		this.MTest3 = MT3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); //super class part of the object get clone
	}

}

class Patient implements Cloneable {

	int id;
	int age;
	String name;
	MedicalTest medicaltest;

	public Patient(int id, int age, String name, MedicalTest medicaltest) {

		this.id = id;
		this.age = age;
		this.name = name;
		this.medicaltest = medicaltest;
	}

	// Overriding clone() method to create a deep copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		Patient patient = (Patient) super.clone();

		patient.medicaltest = (MedicalTest) medicaltest.clone();

		return patient;
	}

}

public class Deepclone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		MedicalTest tests = new MedicalTest("UltraSound", "Echo cardiogram", "X-ray");
		Patient patient = new Patient(1112, 35, "Enriko", tests);
		
		System.out.println("Output test:1, Patient DB");

		// original
		System.out.println("Original object:" + " " + "Name:" + " " + patient.name + ", " + "Age:" + " " + patient.age
				+ ", " + "ID:" + " " + patient.id + ", " + "MedicalTests:" + " " + patient.medicaltest.MTest1 + ", "
				+ patient.medicaltest.MTest2 + ", " + patient.medicaltest.MTest3);

		// cloned // a clone of Patients and assigning it to clonedpatient
		Patient clonedpatient = (Patient) patient.clone();

		System.out.println("Cloned object:" + " " + "Name:" + " " + clonedpatient.name + ", " + "Age:" + " "
				+ clonedpatient.age + ", " + "ID:" + " " + clonedpatient.id + ", " + "MedicalTest:" + " "
				+ clonedpatient.medicaltest.MTest1 + ", " + clonedpatient.medicaltest.MTest2 + ", "
				+ clonedpatient.medicaltest.MTest3);

		// updated the surname of the patient and also the medicaltest
		// surname is updated and Echo cardiogram is updated to Blood test.

		patient.name = "Enriko john";
		patient.medicaltest.MTest2 = "Blood test";

		System.out.println("updated object:" + " " + "Name:" + " " + patient.name + ", " + "Age:" + " " + patient.age
				+ ", " + "ID:" + " " + patient.id + ", " + "MedicalTests:" + " " + patient.medicaltest.MTest1 + ", "
				+ patient.medicaltest.MTest2 + ", " + patient.medicaltest.MTest3);

		//Clone after updating the object
		System.out.println("Cloned Object after updating original object:" + " " + "Name:" + " " + clonedpatient.name
				+ ", " + "Age:" + " " + clonedpatient.age + ", " + "ID:" + " " + clonedpatient.id + ", "
				+ "MedicalTest:" + " " + clonedpatient.medicaltest.MTest1 + ", " + clonedpatient.medicaltest.MTest2
				+ ", " + clonedpatient.medicaltest.MTest3);

		
	    // this is to seperate line
		String newLine = System.getProperty("line.separator"); 
        System.out.println(" " + newLine + " "); // print newline
        
     // this is to print another main method..here it prints the main method of other 4 tests.
		
		DeptSurveyClone.main(args); 
		CloningPersonWorkExperience.main(args);
		CloneChild.main(args);
		ClonedOlymbicDetails.main(args);

	}

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Test 2: College Department Survey - Test2 is the College Department Survey here it updateds the survey of yesr 2015 to 2016.

class DepartmentSurvey implements Cloneable {

	String UniversityName; // University name
	String DeptName; // dpt name
	int SurveyYear; // survey year
	int NoOfStudents; // no of students
	int NoOfCourse; // no of course

	public DepartmentSurvey(String UniversityName, String DeptName, int SurveyYear, int NoOfStudents, int NoOfCourse) {

		this.UniversityName = UniversityName;
		this.DeptName = DeptName;
		this.SurveyYear = SurveyYear;
		this.NoOfStudents = NoOfStudents;
		this.NoOfCourse = NoOfCourse;

	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}

class DeptSurveyClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		DepartmentSurvey DptSurvey = new DepartmentSurvey("Tallinn University", "IT-deptartment", 2015, 1000, 50);

		System.out.println("Output test:2, College Department Survey");

		// original
		System.out.println("Original object:" + " " + "UniversityName:" + " " + DptSurvey.UniversityName + ", "
				+ "DepartmentName:" + " " + DptSurvey.DeptName + ", " + "SurveyYear:" + " " + DptSurvey.SurveyYear
				+ ", " + "No Of Students:" + " " + DptSurvey.NoOfStudents + ", " + "No Of Course:" + " "
				+ DptSurvey.NoOfCourse);

		// cloned 
		DepartmentSurvey clonedDepartmentSurvey = (DepartmentSurvey) DptSurvey.clone();

		System.out.println("Cloned object:" + " " + "UniversityName:" + " " + clonedDepartmentSurvey.UniversityName
				+ ", " + "DepartmentName:" + " " + clonedDepartmentSurvey.DeptName + ", " + "SurveyYear:" + " "
				+ clonedDepartmentSurvey.SurveyYear + ", " + "No Of Students:" + " "
				+ clonedDepartmentSurvey.NoOfStudents + ", " + "No Of Course:" + " "
				+ clonedDepartmentSurvey.NoOfCourse);

		// updated the name the year and the Survey details.

		DptSurvey.SurveyYear = 2016;
		DptSurvey.NoOfStudents = 2000;
		DptSurvey.NoOfCourse = 100;

		System.out.println("Updated object:" + " " + "UniversityName:" + " " + DptSurvey.UniversityName + ", "
				+ "DepartmentName:" + " " + DptSurvey.DeptName + ", " + "SurveyYear:" + " " + DptSurvey.SurveyYear
				+ ", " + "No Of Students:" + " " + DptSurvey.NoOfStudents + ", " + "No Of Course:" + " "
				+ DptSurvey.NoOfCourse);

		//Cloned afted updating.
		System.out.println("Cloned Object after updating original object:" + " " + "UniversityName:" + " "
				+ clonedDepartmentSurvey.UniversityName + ", " + "DepartmentName:" + " "
				+ clonedDepartmentSurvey.DeptName + ", " + "SurveyYear:" + " " + clonedDepartmentSurvey.SurveyYear
				+ ", " + "No Of Students:" + " " + clonedDepartmentSurvey.NoOfStudents + ", " + "No Of Course:" + " "
				+ clonedDepartmentSurvey.NoOfCourse);

		// this is toadd some white space.
		String newLine = System.getProperty("line.separator"); 
		System.out.println(" " + newLine + " "); 
	}

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Test: 3 Person work experience - Test 3 is the persons work experience.

class PersonWorkExperience implements Cloneable {

	String PersonName;
	String OfficeName;
	String Workposition;
	int PersonID;
	int WorkPeriod;
	int AnnualSalary;

	public PersonWorkExperience(String PersonName, String OfficeName, String Workposition, int PersonID, int WorkPeriod,
			int AnnualSalary) {

		this.PersonName = PersonName;
		this.OfficeName = OfficeName;
		this.Workposition = Workposition;
		this.PersonID = PersonID;
		this.WorkPeriod = WorkPeriod;
		this.AnnualSalary = AnnualSalary;

	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}

class CloningPersonWorkExperience {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		PersonWorkExperience personworkexp = new PersonWorkExperience("Ram", "SwedBank", "Analyst", 1462, 2, 1000);

		System.out.println("Output test:3, Persons WORK Experience");

		//original
		System.out.println("Original object:" + " " + "Person Name:" + " " + personworkexp.PersonName + ", " + "ID:"
				+ " " + personworkexp.PersonID + ", " + " OfficeName:" + " " + personworkexp.OfficeName + ", "
				+ "Work Position:" + " " + personworkexp.Workposition + ", " + "Work, Years of Experience:" + " "
				+ personworkexp.WorkPeriod + ", " + "Annual Salary in EUR:" + " " + personworkexp.AnnualSalary);

		// clone object
		PersonWorkExperience clonedPersonWorkExperience = (PersonWorkExperience) personworkexp.clone();

		System.out.println("Cloned object:" + " " + "Person Name:" + " " + clonedPersonWorkExperience.PersonName + ", "
				+ "ID:" + " " + clonedPersonWorkExperience.PersonID + ", " + " OfficeName:" + " "
				+ clonedPersonWorkExperience.OfficeName + ", " + "Work Position:" + " "
				+ clonedPersonWorkExperience.Workposition + ", " + "Work, Years of Experience:" + " "
				+ clonedPersonWorkExperience.WorkPeriod + ", " + "Annual Salary in EUR:" + " "
				+ clonedPersonWorkExperience.AnnualSalary);

		// update - here it update the work position, work period and the annual salary of the person.
		personworkexp.Workposition = "Product Manager";
		personworkexp.WorkPeriod = 4;
		personworkexp.AnnualSalary = 2000;

		System.out.println("Updated object:" + " " + "Person Name:" + " " + personworkexp.PersonName + ", " + "ID:"
				+ " " + personworkexp.PersonID + ", " + " OfficeName:" + " " + personworkexp.OfficeName + ", "
				+ "Work Position:" + " " + personworkexp.Workposition + ", " + "Work, Years of Experience:" + " "
				+ personworkexp.WorkPeriod + ", " + "Annual Salary in EUR:" + " " + personworkexp.AnnualSalary);

		//cloned after updating.
		System.out.println("Cloned Object after updating original object:" + " " + "Person Name:" + " "
				+ clonedPersonWorkExperience.PersonName + ", " + "ID:" + " " + clonedPersonWorkExperience.PersonID
				+ ", " + " OfficeName:" + " " + clonedPersonWorkExperience.OfficeName + ", " + "Work Position:" + " "
				+ clonedPersonWorkExperience.Workposition + ", " + "Work, Years of Experience:" + " "
				+ clonedPersonWorkExperience.WorkPeriod + ", " + "Annual Salary in EUR:" + " "
				+ clonedPersonWorkExperience.AnnualSalary);

		// this is to seperate line
     	String newLine = System.getProperty("line.separator"); 
		System.out.println(" " + newLine + " "); // print newline
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Test 4: Sibilings BMI(Body mass index)  Test 4 is the comparision of 2 sibilings according to their BMI.

// Child1
class Child1 implements Cloneable {

	String Name;
	int Age;
	int Height;
	int Weight;
	int BMI;

	
	public Child1(String Name, int Age, int Height, int Weight, int BMI) {

		this.Name = Name;
		this.Age = Age;
		this.Height = Height;
		this.Weight = Weight;
		this.BMI = BMI;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

//child 2
class Child2 implements Cloneable {

	String Name;
	int Age;
	int Height;
	int Weight;
	int BMI;

	public Child2(String Name, int Age, int Height, int Weight, int BMI) {

		this.Name = Name;
		this.Age = Age;
		this.Height = Height;
		this.Weight = Weight;
		this.BMI = BMI;
	}

	// Overriding clone() method to create a deep copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}

class CloneChild {
	public static void main(String args[]) throws CloneNotSupportedException {

		Child1 child1 = new Child1("Uku", 5, 109, 19, 16);
		Child2 child2 = new Child2("Elora", 3, 93, 14, 13);

		System.out.println("Output test:4, Sibilings BMI");

		// original
		System.out.println("Original object of Child1:" + " " + "Child1 Name:" + " " + child1.Name + ", "
				+ "Child1 Age:" + " " + child1.Age + ", " + " Child1 Height in CM:" + " " + child1.Height + ", "
				+ "Child1 Weight in kg:" + " " + child1.Weight + ", " + "Child1 BMI:" + " " + child1.BMI);
		System.out.println("Original object of Child2:" + " " + "Child2 Name:" + " " + child2.Name + ", "
				+ "Child2 Age:" + " " + child2.Age + ", " + " Child2 Height in CM:" + " " + child2.Height + ", "
				+ "Child2 Weight in kg:" + " " + child2.Weight + ", " + "Child2 BMI:" + " " + child2.BMI);

		// Clone
		Child1 clonedChild1 = (Child1) child1.clone();
		Child2 clonedChild2 = (Child2) child2.clone();

		System.out.println("Cloned object of Child1:" + " " + "Child1 Name:" + " " + clonedChild1.Name + ", "
				+ "Child1 Age:" + " " + clonedChild1.Age + ", " + " Child1 Height in CM:" + " " + clonedChild1.Height
				+ ", " + "Child1 Weight in kg:" + " " + clonedChild1.Weight + ", " + "Child1 BMI:" + " "
				+ clonedChild1.BMI);
		System.out.println("Cloned object of Child2:" + " " + "Child2 Name:" + " " + clonedChild2.Name + ", "
				+ "Child2 Age:" + " " + clonedChild2.Age + ", " + " Child2 Height in CM:" + " " + clonedChild2.Height
				+ ", " + "Child2 Weight in kg:" + " " + clonedChild2.Weight + ", " + "Child2 BMI:" + " "
				+ clonedChild2.BMI);

		// update child 1 - update the Age, height, weight, BMI
		child1.Age = 10;
		child1.Height = 137;
		child1.Weight = 31;
		child1.BMI = 17;

		// update child 2 - update the Age, height, weight, BMI

		child2.Age = 8;
		child2.Height = 127;
		child2.Weight = 25;
		child2.BMI = 16;

		// Updated
		System.out.println("Updated object of Child1:" + " " + "Child1 Name:" + " " + child1.Name + ", " + "Child1 Age:"
				+ " " + child1.Age + ", " + " Child1 Height in CM:" + " " + child1.Height + ", "
				+ "Child1 Weight in kg:" + " " + child1.Weight + ", " + "Child1 BMI:" + " " + child1.BMI);
		System.out.println("Updated object of Child2:" + " " + "Child2 Name:" + " " + child2.Name + ", " + "Child2 Age:"
				+ " " + child2.Age + ", " + " Child2 Height in CM:" + " " + child2.Height + ", "
				+ "Child2 Weight in kg:" + " " + child2.Weight + ", " + "Child2 BMI:" + " " + child2.BMI);

		// cloned after updated
		System.out.println("Cloned Object after updating original object of Child1:" + " " + "Child1 Name:" + " "
				+ clonedChild1.Name + ", " + "Child1 Age:" + " " + clonedChild1.Age + ", " + " Child1 Height in CM:"
				+ " " + clonedChild1.Height + ", " + "Child1 Weight in kg:" + " " + clonedChild1.Weight + ", "
				+ "Child1 BMI:" + " " + clonedChild1.BMI);
		System.out.println("Cloned Object after updating original object of Child2:" + " " + "Child2 Name:" + " "
				+ clonedChild2.Name + ", " + "Child2 Age:" + " " + clonedChild2.Age + ", " + " Child2 Height in CM:"
				+ " " + clonedChild2.Height + ", " + "Child2 Weight in kg:" + " " + clonedChild2.Weight + ", "
				+ "Child2 BMI:" + " " + clonedChild2.BMI);

		// for free space
		String newLine = System.getProperty("line.separator"); 
		System.out.println(" " + newLine + " "); // print newline

	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Test:5 Olymbic details- Test 5 is the two years olymbic details of Australia.

class OlymbicDetails implements Cloneable {

	String Country;
	int year;
	int NoOfGold;
	int NoOfSilver;
	int NoOfBronze;
	int Position;

	public OlymbicDetails(String Country, int year, int NoOfGold, int NoOfSilver, int NoOfBronze, int Position) {

		this.Country = Country;
		this.year = year;
		this.NoOfGold = NoOfGold;
		this.NoOfSilver = NoOfSilver;
		this.NoOfBronze = NoOfBronze;
		this.Position = Position;

	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}

class ClonedOlymbicDetails {
	public static void main(String args[]) throws CloneNotSupportedException {

		OlymbicDetails olymbicdetails = new OlymbicDetails("Australia", 2012, 7, 15, 12, 8);

		System.out.println("Output test:5, Australia's olymbic detail");

		// original
		System.out.println("Original object:" + " " + "Country Name:" + " " + olymbicdetails.Country + ", "
				+ "Year of Olymbic:" + " " + olymbicdetails.year + ", " + " No Of Gold medal they won:" + " "
				+ olymbicdetails.NoOfGold + ", " + "No of Silver medal they won:" + " " + olymbicdetails.NoOfSilver
				+ ", " + "No of Bronze medal they won" + " " + olymbicdetails.NoOfBronze + ", " + " "
				+ "No of position:" + " " + olymbicdetails.Position + "th position");

		// cloned
		OlymbicDetails clonedOlymbicDetails = (OlymbicDetails) olymbicdetails.clone();

		System.out.println("cloned object:" + " " + "Country Name:" + " " + clonedOlymbicDetails.Country + ", "
				+ "Year of Olymbic:" + " " + clonedOlymbicDetails.year + ", " + " No Of Gold medal they won:" + " "
				+ clonedOlymbicDetails.NoOfGold + ", " + "No of Silver medal they won:" + " "
				+ clonedOlymbicDetails.NoOfSilver + ", " + "No of Bronze medal they won" + " "
				+ clonedOlymbicDetails.NoOfBronze + ", " + " " + "No of position:" + " " + clonedOlymbicDetails.Position
				+ "th position");

		// update the year, medals and position.
		olymbicdetails.year = 2016;
		olymbicdetails.NoOfGold = 8;
		olymbicdetails.NoOfSilver = 11;
		olymbicdetails.NoOfBronze = 10;
		olymbicdetails.Position = 10;

		System.out.println("updated object:" + " " + "Country Name:" + " " + olymbicdetails.Country + ", "
				+ "Year of Olymbic:" + " " + olymbicdetails.year + ", " + " No Of Gold medal they won:" + " "
				+ olymbicdetails.NoOfGold + ", " + "No of Silver medal they won:" + " " + olymbicdetails.NoOfSilver
				+ ", " + "No of Bronze medal they won" + " " + olymbicdetails.NoOfBronze + ", " + " "
				+ "No of position:" + " " + olymbicdetails.Position + "th position");

		// Cloned after updating
		System.out.println("Cloned Object after updating original object:" + " " + "Country Name:" + " "
				+ clonedOlymbicDetails.Country + ", " + "Year of Olymbic:" + " " + clonedOlymbicDetails.year + ", "
				+ " No Of Gold medal they won:" + " " + clonedOlymbicDetails.NoOfGold + ", "
				+ "No of Silver medal they won:" + " " + clonedOlymbicDetails.NoOfSilver + ", "
				+ "No of Bronze medal they won" + " " + clonedOlymbicDetails.NoOfBronze + ", " + " " + "No of position:"
				+ " " + clonedOlymbicDetails.Position + "th position");

	}
}