package Java_practice2;
//109360127_�q�l�T��_�\�ʺ�
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page19
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݧA�O�k�Ͷ�?");
		System.out.println("�п�JY��N");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		char ch1 = str1.charAt(0);
		
		if(ch1 == 'Y' || ch1 == 'y')
		{
			System.out.println("�A�O�k�Ͱ�!");
		}
		else if(ch1 == 'N' || ch1 == 'n')
		{
			System.out.println("�A�O�k�Ͱ�!");
		}
		else
		{
			System.out.println("�п�JY��N");
		}
	}
}
