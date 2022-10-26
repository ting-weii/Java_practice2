package Java_practice2;
import java.io.BufferedReader;
//109360127_電子三甲_許廷維
import java.io.IOException;
import java.io.InputStreamReader;

public class page32
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num1 = Integer.parseInt(str1);
		
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println("第" + i + "次的處理");
			if(i == num1)
			{
				break;
			}
		}
	}
}
