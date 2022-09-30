import java.util.Scanner;
import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] list = {65,12,-3,402,-25,29};
        Arrays.sort(list);
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        for (int i=0;i<list.length;i++){
            if (list[i]>number){
                int max = list[i];
                int min = list[i-1];
                System.out.println(number+" sayısından büyük en yakın değer : "+max);
                System.out.println(number+" sayısından küçük en yakın değer : "+min);
                break;
            }
        }

    }
}
