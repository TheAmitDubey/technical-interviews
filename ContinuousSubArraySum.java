/**
This solution is applicable for positive numbers

Time complexity - O(N)
Spcace complexity - O(1)
**/
public int[] continuousSubArray(int[]  data, int size, int sum){
  boolean found;
  int[] result = new int[2];
  
  int firstIndex=0;  
  int s=0;
  
  for(int i=0; i<size;i++){
    s = s + arr[i];
    
    if(s > sum){
      s = s - arr[index++]
    }
    
    if(s == sum){
      found = true;
      result[0] = index;
      result[1] = i;
      break;
    }
  }
  
  if(found){
    return result;
  }
  return null;
}
