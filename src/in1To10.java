public class in1To10 {
  public boolean in1To10(int n, boolean outsideMode) {
    if (n > 0 && n < 11 && !outsideMode) {
      return true;
    } else
      return (n <= 1 || n >= 10) && outsideMode;
  }
}
