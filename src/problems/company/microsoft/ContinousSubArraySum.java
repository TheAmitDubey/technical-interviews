package problems.company.microsoft;

public class ContinousSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]  arr = {1,2,3,4,5,6,7,8,9,10};
		int N = 10;
		int S = 15;
		int[] res = sumArray(arr, N, S);
		System.out.println(res[0] +" - "+ res[1]);
	}
	
	public static int[] sumArray(int[] arr, int N, int sum) {
		int[] res = new int[2];
		
		int index =0,s=0, i=0;
		boolean found = false;
		
		for(i=0;i<N;i++) {
			s = s + arr[i];
			
			if(s > sum) {
				s = s - arr[index++];
			}
			
			if(s == sum) {
				found = true;
				break;
			}
		}
		
		if(found) {
			res[0] = index;
			res[1] = i;
			return res;
		}
		
		return null;
	}

}
