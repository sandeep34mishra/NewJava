public class ArrayLargestAndSmallestElement {
    public static void main(String[] args) {

        int array[]={1,3,5,7,9,2,4,6,8};
        int largestNum=array[0];
        int smallestNum=array[0];

        for(int i=1;i< 9;i++){
            if(array[i]>largestNum){
                largestNum=array[i];
            }
            if(array[i]<smallestNum){
                smallestNum=array[i];
            }

        }
        System.out.println("Largest Number in array is: " + largestNum);
        System.out.println("Smallest Number in array is: " + smallestNum);
    }
}
