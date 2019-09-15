package pl.dominisz.horseracingduals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HorseRacingServiceTests {

  private static final int[] SIMPLE_CASE_INPUT = {5, 8, 9};
  private static final int SIMPLE_CASE_OUTPUT = 1;

  private static final int[] HORSES_IN_ANY_ORDER_INPUT = {5, 15, 17, 3, 8, 11, 28, 6, 55, 7};
  private static final int HORSES_IN_ANY_ORDER_OUTPUT = 1;

  @Test
  void strengthDifference() {
    assertEquals(SIMPLE_CASE_OUTPUT, HorseRacingService.strengthDifference(SIMPLE_CASE_INPUT));
    assertEquals(
        HORSES_IN_ANY_ORDER_OUTPUT,
        HorseRacingService.strengthDifference(HORSES_IN_ANY_ORDER_INPUT));
  }

  @Test
  void sortedStrengthDifference() {
    assertEquals(
        SIMPLE_CASE_OUTPUT, HorseRacingService.sortedStrengthDifference(SIMPLE_CASE_INPUT));
    assertEquals(
        HORSES_IN_ANY_ORDER_OUTPUT,
        HorseRacingService.sortedStrengthDifference(HORSES_IN_ANY_ORDER_INPUT));
  }
}
