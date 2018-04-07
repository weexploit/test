package CompleteNum;

public class CompleteNum {
	public static void Func(int n) {
		int i,k=1;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				k+=i;
		}
		if(k==n)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
