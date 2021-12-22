package weekOf2021Dec20;

public class Happy 
{
	
	public static boolean isHappy(int checkIfHappy)
	{
		boolean happy = false;
		boolean undetermined = true;
		String checkIfHappyAsString = String.valueOf(checkIfHappy);
		checkIfHappy = 0;
		
		while (undetermined)
		{
			for(int count = 0; count < checkIfHappyAsString.length(); count++)
			{
				checkIfHappy += Math.pow(checkIfHappyAsString.charAt(count) - 48, 2);
			}
			
			if(checkIfHappy == 1)
			{
				happy = true;
				undetermined = false;
			}
			
			if(checkIfHappy == 4)
			{
				happy = false;
				undetermined = false;
			}
			
			checkIfHappyAsString = String.valueOf(checkIfHappy);
			checkIfHappy = 0;
		}
		
		return happy;
	}
	
	public static void main(String[] args) 
	{
		for(int count = 1; count <= 50; count++)
		{
			System.out.println("Is " + count + " happy? - " +isHappy(count));
		}
	}
}
