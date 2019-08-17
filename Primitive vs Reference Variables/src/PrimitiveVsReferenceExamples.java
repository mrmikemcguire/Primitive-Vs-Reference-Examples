import java.util.Scanner;
 
public class PrimitiveVsReferenceExamples
	{

	public static void main(String[] args)
		{
		int primitiveVariable1 = 5;
		int primitiveVariable2 = 5;
		
		System.out.println("primitiveVariable1 = " + primitiveVariable1);
		System.out.println("primitiveVariable2 = " + primitiveVariable2);
		System.out.println();
		
		if (primitiveVariable1 == primitiveVariable2)
			{
			System.out.println("These two are equal.");
			}
		else
			{
			System.out.println("These two are NOT equal.");
			}
		
		System.out.println();

		String referenceVariable1 = new String("moose");
		String referenceVariable2 = new String("moose");
		
		System.out.println("referenceVariable1 = " + referenceVariable1);
		System.out.println("referenceVariable2 = " + referenceVariable2);
		System.out.println();
		
		if (referenceVariable1 == referenceVariable2)
			{
			System.out.println("These two are equal using ==.");
			}
		else
			{
			System.out.println("These two are NOT equal using ==.");
			}

		System.out.println();
		
		if (referenceVariable1.equals(referenceVariable2))
			{
			System.out.println("These two are equal using the equals() method.");
			}
		else
			{
			System.out.println("These two are NOT equal using the equals() method..");
			}
		
		System.out.println();
		
		String [] myArray = {"Fred", "Wilma", "Barney", "Betty"};
		System.out.println(myArray);
		}

	}
