import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {
    public static int removeDuplicates(int array[],int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(array[i]!=array[i+1]){
                temp[j++]=array[i];
            }
        }
        temp[j++]=array[n-1];
        for(int i=0;i<j;i++)
        {
            array[i]=temp[i];
        }
        return j;
    }
    public static void main(String args[])
    {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=input.nextInt();
        int[] array = new int[10];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        int length=array.length;
        length=removeDuplicates(array, n);
        System.out.println("After removing duplicate elements:");
        for(int i=0;i<length;i++)
        {
            System.out.println(array[i]+"");
        }
    }   
}


Output:
Enter the size of array:
10
Enter elements:
25 18 28 29 25 18 29 28 25 18
Array elements are:
25
18
28
29
25
18
29
28
25
18
After removing duplicate elements:
18
25
28
29

