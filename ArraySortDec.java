public class ArraySortDec {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        int [] arr = new int [] {55, 40, 80, 65, 71};
        int temp = 0;
        System.out.println("Elements of original array: ");
        for (int i = 0; i < 4; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = i+1; j < 4; j++)
            {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i <4; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
