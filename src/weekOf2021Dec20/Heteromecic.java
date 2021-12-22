package weekOf2021Dec20;

public class Heteromecic 
{	
	public static boolean isHeteromecic(int checkIfPronic)
	{
		boolean heteromecic = false;
		// The lower of the two numbers that multiply to make a Heteromecic number should be less than the square root.
		int countCheck = (int) Math.ceil(Math.sqrt(checkIfPronic));
		
		for (int count = 0; count <= countCheck; count++)
		{
			if ( count * (count + 1) == checkIfPronic)
			{
				heteromecic = true;
			}
		}
		
		return heteromecic;
	}
	
	public static void main(String[] args) 
	{
		// Spent time making a negative int test loop before I realized Heteromecic numbers would be non-negative anyway.
		for(int count = 0; count < 50; count++) 
		{
			System.out.println("Is " + count + " Heteromecic? - " + isHeteromecic(count));
		}
	}
}
