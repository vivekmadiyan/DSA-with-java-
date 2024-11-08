public class RemDup {
    public static void main(String[] args) {
        int [] nums={
            1,1,2
        };
      
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println(i+1);// to print no of original elements(without duplicates)
        for(int k=0;k<=i;k++){
            System.out.print(nums[k]+ " ");//print array
        }
    }
}
