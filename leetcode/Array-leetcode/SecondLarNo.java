public class SecondLarNo {
    public static void main(String args[]){
        int arr[]={1,3,46,3,5,5};
        // int lar=arr[0];
        // for(int i =0;i<arr.length;i++){
        
        //     if(arr[i]>lar){
        //         lar=arr[i];
        //     }}
        //     int sec = -1;
        //     for(int i =0;i<arr.length;i++){
        //        if(arr[i]!=lar && arr[i]>sec){
        //         sec=arr[i];
        //        }
            
        // }System.out.print(sec);
        int lar = arr[0];
        int sec=-1;
        for(int i =0;i<arr.length;i++){
            if (arr[i]>lar) {
               sec = lar;
               lar=arr[i];   
            }else if(arr[i]<lar && arr[i]>sec){
               sec=arr[i];
            }
        }System.out.print(sec);

    }
    
}
