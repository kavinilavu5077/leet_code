public class RemoveDuplicate {
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,5,6,6};
      int uniqueCount =1;
        System.out.print(arr[0] + " ");
        for(int i =1;i<arr.length-1;i++){
             //if(arr[i]==arr[i-1]){
            //     continue;
            // }else{
                if(arr[i]!=arr[i-1]){
                    uniqueCount++;
                System.out.print(arr[i]+" ");
            }
          
        
        }
        System.out.println("Unique elements are "+uniqueCount);
    
    
    int j =0;
for(int k =1;k<arr.length;k++){
    if(arr[j]!=arr[k]){
        arr[j+1]=arr[k];
        j++;
    }
}System.out.print(j+1);
}

}
