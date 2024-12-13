package indefinido;

import java.util.Locale;
import java.util.Scanner;


public class BeeCrowd {
	public static void main ( String[] args ) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner ( System.in);
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		 double c = input.nextDouble();

		 double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
		 System.out.printf("MEDIA = %.1f\n" + media);
	}
}
