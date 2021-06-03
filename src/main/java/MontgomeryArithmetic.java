import java.math.BigInteger;

public class MontgomeryArithmetic {

static BigInteger montgomeryMultiply(BigInteger c, BigInteger x) {

    BigInteger sum = BigInteger.ZERO;
    BigInteger addOperand;

    for (int i = 0; i < Math.max(c.intValue(), x.intValue()); i++) {

      if (c.testBit(i)) {

        addOperand = x;

      } else {

        addOperand = BigInteger.ZERO;
      }

      sum = add(sum, addOperand);

      x = x.shiftRight(1);
    }

    return sum;
  }

  static BigInteger add(BigInteger a, BigInteger b) {

    return a.add(b);
  }
}
