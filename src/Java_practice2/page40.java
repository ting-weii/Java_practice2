package Java_practice2;

import java.lang.reflect.Array;

//109360127_電子三甲_許廷維

public class page40
{
	public static void main(String[] args)
	{
		int[] intArray = (int[])Array.newInstance(int.class,3);
		
		Array.set(intArray, 0, 123);
		Array.set(intArray, 1, 456);
		Array.set(intArray, 2, 789);
		
		System.out.println("intArray[0] = " + Array.get(intArray,0));
		System.out.println("intArray[1] = " + Array.get(intArray,1));
		System.out.println("intArray[2] = " + Array.get(intArray,2));
	}
}
