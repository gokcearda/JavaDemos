package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//6 -->1,2,3
		//28 -->1,2,4,7,14
		//Mükemmel sayılar pozitif bölenlerinin toplamına eşit olan sayılardır.
		int number=34;
		int total=0;
		
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				total+=i;
			}

		}
		if (total==number) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");

		}

	}

}
