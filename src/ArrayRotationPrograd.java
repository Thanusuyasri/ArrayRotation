import java.util.Scanner;

public class ArrayRotationPrograd {
    public static void reverseRange(int[] array,int b,int c)
    {

        while(b<c)
        {
            int temp=array[b];
            array[b]=array[c];
            array[c]=temp;
            b++;
            c--;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        int k=scanner.nextInt();
        reverseRange(array,0,sizeOfarray-1);
        reverseRange(array,0,k-1);
        reverseRange(array,k,sizeOfarray-1);
        for(int i:array)
        {
            System.out.println(i+" ");
        }
    }
}
