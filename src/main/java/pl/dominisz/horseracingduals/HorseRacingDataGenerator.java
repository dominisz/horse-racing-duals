package pl.dominisz.horseracingduals;

import java.util.Random;

public class HorseRacingDataGenerator {
  public static final int RANDOM_SEED = 0;
  public static final int MAX_STRENGTH = 10_000_000;

  public static int[] generateStrengths(int count) {
    Random random = new Random(RANDOM_SEED);
    int[] strengths = new int[count];

    for (int i = 0; i < count; i++) {
      strengths[i] = random.nextInt(MAX_STRENGTH);
    }

    return strengths;
  }
}
