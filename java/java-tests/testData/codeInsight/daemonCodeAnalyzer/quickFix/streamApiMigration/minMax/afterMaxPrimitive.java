// "Replace with max()" "true"

import java.util.*;

public class Main {
  public Person max(int[] ints) {
    int max = Arrays.stream(ints).filter(anInt -> anInt < 10).filter(anInt -> anInt >= 0).max().orElse(0);
  }
}