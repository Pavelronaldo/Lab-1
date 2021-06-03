import java.math.BigInteger;

public class Main {


	public static void main(String[] args) {

		//System.out.println(EuclideanAlgorithm.euAlgorithm(24, 48)); //Euclidian test
		//System.out.println(KarazubaMult.karatsuba(12, 16)); //Karazuba test
		//System.out.println(binpow(3, 3)); //binaryc pow method
		//System.out.println(ferma(2)); //Ferma test
		//System.out.println(MillerRabinTest.millerRabinTest(2)); //Miller-Rabin test
		//System.out.println(MontgomeryArithmetic.montgomeryMultiply(BigInteger.valueOf(1232376373), BigInteger.valueOf(323245435))); //Montgomery Mult test
	}

	public static int binpow(int a, int n) {

		if (n == 0) {

			return 1;
		}

		if (n % 2 == 1) {

			return binpow (a, n - 1) * a;

		} else {

			int b = binpow (a, n / 2);
			return b * b;
		}
	}

	public static boolean ferma(long x) {

		if(x == 2) {

			return true;
		}

		for(int i = 0; i < 100; i++) {

			long a = (long) (Math.random() % (x - 2) + 2);

			if (EuclideanAlgorithm.euAlgorithm(a, x) != 1) {

				return false;
			}

			if(Math.pow(a, x - 1) != 1) {

				return false;
			}
		}

		return true;
	}
}