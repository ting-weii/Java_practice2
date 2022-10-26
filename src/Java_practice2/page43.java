package Java_practice2;
//109360127_電子三甲_許廷維

public class page43
{
	public static void main(String[] args)
	{
		int[] test = {80,60,22,50,74};

		for(int i=0;i<test.length;i++)
		{
			System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
		}
		
		System.out.println("考試人數為" + test.length + "人");
	}
}
