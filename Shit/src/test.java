import java.util.Scanner;

public class test
{
	public static void main (String [] args) {
		//local constant
		final int QUIT = -1;

		//local variable
		int value;
		int count = 0;
		int array[];
		int arraySize;


		/********************************/
		Scanner input = new Scanner(System.in);
		System.out.print("enter the array size: ");
		arraySize = input.nextInt();
		array = new int[arraySize];
		while (count < arraySize)
		{
			System.out.print("enter an odd integer: ");
			value = input.nextInt();

			if(value != QUIT)
			{
				if (value >= 1 && value <= 31 && (value % 2) != 0)
				{
					array[count] = value;

					if(count < arraySize-1)
						count++;
					else
						count = arraySize;
				} else
					System.out.print("that is not a odd integer \n");
			}
			else
				count = arraySize;
		}

		if(arraySize > 2)
		{
			for (int pos = 0; pos < count; pos++)
				System.out.println(array[pos]);
		} else
			for (int pos = 0; pos < count; pos++)
				System.out.println(array[pos]);
	}
}