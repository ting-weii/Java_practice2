package Java_practice2;
//109360127_�q�l�T��_�\�ʺ�
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page14
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J���:");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br1.readLine());
		
		switch(num1)
		{
			case 1:
			{
			System.out.println("��J���O1");
			break;
			}
			case 2:
			{
			System.out.println("��J���O2");
			break;
			}
			default:
			{
			System.out.println("�п�J1��2");
			break;
			}
		}
	}
}