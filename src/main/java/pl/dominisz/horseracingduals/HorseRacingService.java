package pl.dominisz.horseracingduals;

import java.util.Arrays;

public class HorseRacingService {

  public static int strengthDifference(int[] strengths) {
    int count = strengths.length;
    int minDifference = Integer.MAX_VALUE;
    for (int i = 0; i < count - 1; i++) {
      for (int j = i + 1; j < count; j++) {
        int difference = Math.abs(strengths[i] - strengths[j]);
        if (difference < minDifference) {
          minDifference = difference;
        }
      }
    }
    return minDifference;
  }

  public static int sortedStrengthDifference(int[] strengths) {
    int count = strengths.length;
    int minDifference = Integer.MAX_VALUE;
    Arrays.sort(strengths);
    for (int i = 0; i < count - 1; i++) {
      int difference = Math.abs(strengths[i] - strengths[i + 1]);
      if (difference < minDifference) {
        minDifference = difference;
      }
    }
    return minDifference;
  }
}
