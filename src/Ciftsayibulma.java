import java.util.Scanner;

public class Ciftsayibulma {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi dahil edin : ");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}


