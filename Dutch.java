public class Dutch {
    public static void main(String[] args) {
        int [] arr ={0, 1, 2, -1, -3, 0, 2, 1, -5};
        int mid=0;
        int left=0;
        int right=arr.length-1;
        while(mid<=right){
            if(arr[mid]<0){
            int temp=arr[left];
            arr[left]=arr[mid];
            arr[mid]=temp;
            mid++;
            left++;
            }
            else{
                mid++;
            }
           
        }
        mid=left;
        right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
            int temp=arr[left];
            arr[left]=arr[mid];
            arr[mid]=temp;
            mid++;
            left++;
            }
            else if(arr[mid]==2){
            int temp=arr[right];
            arr[right]=arr[mid];
            arr[mid]=temp;
            right--;
            }
            else{
                mid++;
            }
           
           
        }
         for(int num: arr){
                System.out.print(num  + " ");
            }
        

    }
}