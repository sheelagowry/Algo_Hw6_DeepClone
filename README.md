# Algo_Hw6_DeepClone

 #Deep Clone

“Deep Clone” - A deep clone of an object exactly clones all the fields of the original object. 
 If the original object has any references to any other objects, then copy of those objects are also created by calling clone( ) method on them. 
 That means clone object and original object will be 100% disjoint. 
 They will be 100% independent of each other. 
 Any changes made to Original object will not be reflected in clone object or vice-versa.
 
 #Discription of the solution:
 Here a java program is being done, using Deep clone concept. 
 I have used 5 different scenarios to print my output. 
 According to this program Original object, cloned object, updated object and Cloned object after updating the original object are displayed in the output. 
 And the used 5 different scenarios are described below:
 
 Output Testing plan:

1.	Output test1: Patient Database.
This test is to update and clone the patient database.

Here, the Patient Name, age, ID and the three medical tests are the original objects of this test scenario.
The Original object is being cloned by using clone() method. 
Then after few years, patient surname, age, and the medical tests are updated to the original object. 
Even after the original object was updated, the cloned object does not have any impact of the update.

2.	Output test: 2 College Department Survey.
This test is to compare, clone and update the department survey between two years.

Here, The University Name, Department Name, Survey year, Number of students and the Number of course are the original objects of this test scenario.
The Original object is being cloned by using clone() method.
There were 1000 students and 50 courses according to the ‘2015 survey’. 
After updating the original object there were 2000 students and 100 courses according to the ‘2016 survey’. 
Even after the original object was updated, the cloned object does not have any impact of the update.

3.	Output test: 3 Persons work Experience.
This test details about the work experience of a person before and after his promotion.

Here, Person Name, ID, Office Name, Work position, Work year and Annual salary are the original objects of this test scenario. 
The Original object is being cloned by using clone() method. 
The person was working as an Analyst with 2 years of experience and his annual salary was 1000 Euros.
And later he was promoted to product manager and his salary was raised to 2000Euro with 4 years of experience. 
Now his promotion was updated to his original object.
Even after the original object was updated, the cloned object does not have any impact of the update.


4.	Output test: 4 Siblings BMI.
This test is to check, clone and update the BMI(Body mass index) of two siblings at two different age period.

Here, Children Name, Age, Height, Weight, BMI are the original objects of this test scenario.
The Original object is being cloned by using clone() method. 
Here the first child is 5 years old and the second child is 3 years old, their BMI is calculated using is Height and Weight. 
After 5 years their BMI is again calculated using their updated Height and Weight. 
Even after the original object was updated, the cloned object does not have any impact of the update.

5.	Output test: 5 Australia's Olympic detail.
This test is to clone and update the Olympic details of Australia.

Here, Country Name, Olympic year, Number of Gold medals, Number of Silver medals, Number of Bronze medals and Olympic position are the original objects of this test scenario. 
The Original object is being cloned by using clone() method.
In 2012 Australia won 7 Gold medals, 15 Silver medals, 12 Bronze medals and took 8th position in the Olympic.
After updated the Olympic details in 2016 Australia won 8 Gold medals, 11 Silver medals, 10 Bronze medals and took 10th position in the Olympic.
Even after the original object was updated, the cloned object does not have any impact of the update.





