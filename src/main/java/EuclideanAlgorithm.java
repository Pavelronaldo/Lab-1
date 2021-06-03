public class EuclideanAlgorithm {

	public static long euAlgorithm(long tmp, long m) {

		long n;

		if (m < tmp) {

			n = m;
			m = tmp;

		} else {

			n = tmp;
		}

		long[] l1 = {m, 1, 0};
		long[] l2 = {n, 0, 1};
		long[] l3 = new long[3];

		while (l1[0] - l2[0] * (l1[0] / l2[0]) > 0) {

			System.arraycopy(l2, 0, l3, 0, 3);
			long q = l1[0] / l2[0];

			for (int i = 0; i < 3; i++) {

				l2[i] = (l1[i] - l2[i] * q);
			}

			System.arraycopy(l3, 0, l1, 0, 3);
		}

		return l2[0];
	}
}
