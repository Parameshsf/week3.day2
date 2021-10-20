package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;

		String[] strArray = text.split(" ");
		System.out.println("The text from String Array is ");

		for (int i = 0; i < strArray.length; i++) 
		{

			for (int j = i+1; j < strArray.length; j++) 
			{
				if (strArray[i].equalsIgnoreCase(strArray[j])) 
				{
					count = count + 1; // System.out.println(strArray[j]);
					if (count > 1) 
					{
						strArray[j] = " ";
						// System.out.print(strArray[j]);// replacing array data with space " "

					}

				}

			}

		}
		for (int k = 0; k < strArray.length; k++) 
		{
			System.out.print(strArray[k] +" ");

		}

	}

}
