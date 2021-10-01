package exercises;
public class Ford {
	/*
	 * Since these properties should belong to the class of "Ford", they should be defined within the
	 * Ford class.  So, they should be moved here.
	 */
	int myfordyear;
	String myfordmake;
	String myfordmodel;
	String fordspecs;
	String color;
	
	public static void main(String[] args) {
		/*
		 * Below creates a Ford object out of the class of Ford.  This is a specific instance of the
		 * "Ford" class.
		 */
		Ford fordCar1 = new Ford();
		/*
		 * With the object created, we can set the values.  This is object 1.
		 */
		fordCar1.myfordyear = 2017;
		fordCar1.myfordmake = "Ford";
		fordCar1.myfordmodel = "Fusion";
		fordCar1.fordspecs = "Hybrid";
		fordCar1.color = "Gray";
		
		/*
		 * Next, create a second Ford object, doing the same as the first, picking out what properties
		 * you wish to set.
		 */
		Ford fordCar2 = new Ford();
		fordCar2.myfordyear = 2013;
		fordCar2.myfordmake = "Ford";
		fordCar2.myfordmodel = "Taurus";
		fordCar2.fordspecs = "Petrol";
		fordCar2.color = "Blue";
		
			//print out car 1 details
		System.out.println("The Year for object 1 is a: " + fordCar1.myfordyear);
		System.out.println("This Make for object 1 is a: " + fordCar1.myfordmake);
		System.out.println("The Model for object 1 is a: " + fordCar1.myfordmodel);
		System.out.println("The Configuration for object 1 is a: " + fordCar1.fordspecs);
		System.out.println("The Car color for object 1 is: " + fordCar1.color);
		
		System.out.println("---------------------------------------------------");
		
			//print out car 2 details
		System.out.println("The Year for object 2 is a: " + fordCar2.myfordyear);
		System.out.println("This Make for object 2 is a: " + fordCar2.myfordmake);
		System.out.println("The Model for object 2 is a: " + fordCar2.myfordmodel);
		System.out.println("The Configuration for object 2 is a: " + fordCar2.fordspecs);
		System.out.println("The Car color for object 2 is: " + fordCar2.color);
	}

}