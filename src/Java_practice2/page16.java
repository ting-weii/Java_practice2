package Java_practice2;
//109360127_�q�l�T��_�\�ʺ�
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page16
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J���:");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		char ch1 = str1.charAt(0);
		
		switch(ch1)
		{
			case 'a':
			{
			System.out.println("��J���Oa");
			break;
			}
			case 'b':
			{
			System.out.println("��J���Ob");
			break;
			}
			default:
			{
			System.out.println("�п�Ja��b");
			break;
			}
		}
	}
}
