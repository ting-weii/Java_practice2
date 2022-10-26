package Java_practice2;
//109360127_電子三甲_許廷維
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class page14
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br1.readLine());
		
		switch(num1)
		{
			case 1:
			{
			System.out.println("輸入的是1");
			break;
			}
			case 2:
			{
			System.out.println("輸入的是2");
			break;
			}
			default:
			{
			System.out.println("請輸入1或2");
			break;
			}
		}
	}
}
