package Javaevenodd;

public class javaevenodd {

	public static void main(String[] args) {
		  int arr[]={2,1,4,3,5,6};
	        if(arr.length<=1){
	            return;
	        }
	        int left=0;
	        int right=arr.length-1;
	        while(left<right){
	            while((arr[left]%2==0)&&(left<right)){
	                left++;
	            }
	            while((arr[right]%2!=0)&&(left<right)){
	                right--;
	            }
	            if(left<right){
	                int x=arr[left];
	                arr[left]=arr[right];
	                arr[right]=x;
	                
	                left++;
	                right--;
	            }
	        }
	        for(int i=0; i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	        }
	        
	    }
	}
