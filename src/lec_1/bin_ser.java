package lec_1;

public class bin_ser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int root(int n) {
		int lo= 1;
		int hi= n;
		int ans = 0;
		while(lo<=hi) {
			int mid= lo + (hi-lo)/2;
			if(mid*mid <=n)
			{
				ans= mid;
				lo= mid+1;
			}
			else
				hi= mid-1;
		}
		return ans;
	}
}
