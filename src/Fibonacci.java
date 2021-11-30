import java.util.Scanner;

public class Fibonacci {

	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Sua sequ�ncia tem quantos elementos? ");
    	int s = sc.nextInt();
    	System.out.print("N�mero a ser comparado: ");
    	int n = sc.nextInt();
    	boolean pertence = false;
    	
	for (int i = 0; i < s; i++) {
            if (n == Fibonacci.fibo(i)) {
            	pertence = true;
            	
            }else {
            	
            }
        }
	if (pertence == true) {
		System.out.println("Pertence a sequ�ncia! ");
	}else {
		System.out.println("N�o pertence a sequ�ncia! ");
	}

    }

}