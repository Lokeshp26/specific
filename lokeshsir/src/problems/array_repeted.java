package problems;

public class array_repeted {
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3};
		int brr[]={4,5,3};
		int crr[]={6,7,3};
		int ans[]={arr.length};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<brr.length;j++){
				if(arr[i]==brr[j]){
					arr[i]=brr[j];
					ans[i]=arr[i];
				}
			}
				
		
		for(int k=0;k<crr.length;k++){
			if(crr[k]==ans[i]){
				ans[arr.length]=crr[k];
			}
			System.out.println(ans[i]);
		}}
		
	
		
		
	}

}
