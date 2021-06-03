public class KarazubaMult {

	public static long karatsuba(long i, long j) {

		if (i < 10 || j < 10){

			return i*j;
		}

		double n = getLength(Math.max(i, j));

		if (n % 2 == 1) {

			n++;
		}

		long a = (long) (i / Math.pow(10, (n / 2)));
		long b = (long) (i % Math.pow(10, (n / 2)));
		long c = (long) (j / Math.pow(10, (n / 2)));
		long d = (long) (j % Math.pow(10, (n / 2)));

		long first = karatsuba(a, c);
		long second = karatsuba(b, d);
		long third = karatsuba(a + b, c + d);

		return ((long) ((first * Math.pow(10, n)) +
			((third - first - second) * Math.pow(10, (n / 2))) + second));
	}

	public static int getLength(long a){

		String b = Long.toString(a);
		return b.length();
	}
}
