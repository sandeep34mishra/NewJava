public class ArmstrongNumbers {
    public static void main(String[] args)
    {
        int number, count = 0, temp , arm = 0,i=1;
        String allNumStr="";
        for( ; i <= 1000; i++)
        {
            number = i;
            while(number > 0)
            {
                temp= number % 10;
                arm = arm + (temp * temp * temp);
                number = number / 10;
            }
            if(arm == i)
            {
                allNumStr=allNumStr+" , "+i;
            }
            arm = 0;
        }
        System.out.print("Armstrong numbers from 1 to 1000 are "+allNumStr);
    }
    }


