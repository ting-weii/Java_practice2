package Java_practice2;
//109360127_�q�l�T��_�\�ʺ�
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page21
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݭn��������u?");
		System.out.println("�п�J���");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num1 = Integer.parseInt(str1);
		
		char ch1 = (num1 == 1)?'A':'B';
		System.out.println("��ܤF" + ch1 + "���u");
	}
}
