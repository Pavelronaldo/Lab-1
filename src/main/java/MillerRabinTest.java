

public class MillerRabinTest {

	public static boolean millerRabinTest(long num) {

		if (num % 2 == 0 && num != 2) {

			return false;

		} else {

			double d;
			int r = 0;

			while ((num - 1) % Math.pow(2, r + 1) == 0) {

				r++;
			}

			d = (num - 1) % Math.pow(2, r);
			int[] a = {2, 3, 5, 7, 11, 13, 17, 23, 31, 62, 73, 1662803};

			boolean primality = true;

			for (int i : a) {

				if ((Math.pow(i, d) - 1) % num != 0) {

					for (int s = 0; s < r - 1; s++) {

						if ((Math.pow(i,
							Math.pow(2, s) * d) + 1) % num != 0) {

							primality = false;
							break;
						}
					}
				}
			}

			return primality;
		}
	}
}
