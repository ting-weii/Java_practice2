package Java_practice2;
import java.io.BufferedReader;
//109360127_�q�l�T��_�\�ʺ�
import java.io.IOException;
import java.io.InputStreamReader;

public class page32
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݭn�b�ĴX���B�z�����j��O?(1~10)");		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num1 = Integer.parseInt(str1);
		
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println("��" + i + "�����B�z");
			if(i == num1)
			{
				break;
			}
		}
	}
}
