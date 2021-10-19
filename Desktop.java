package week3.day2;

public class Desktop implements Hardware, Software  {

	
	//MultiLevel Interface 
	
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resources Method from Hardware Interface invoked");
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources Method from Hardware Interface invoked");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop db = new Desktop();
		db.hardwareResources();
		db.softwareResources();

	}

}
