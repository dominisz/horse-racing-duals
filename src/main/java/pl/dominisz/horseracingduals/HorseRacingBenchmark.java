package pl.dominisz.horseracingduals;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@Fork(value = 0)
@Warmup(iterations = 0)
@Measurement(iterations = 1)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class HorseRacingBenchmark {

  @State(Scope.Benchmark)
  public static class HorseRacingState {

    @Param(value = {"10", "100", "500", "1000", "10000", "50000", "100000"})
    int count;

    int[] strengths;

    @Setup()
    public void setup() {
      strengths = HorseRacingDataGenerator.generateStrengths(count);
    }
  }

  @Benchmark()
  public void testStrengthDifference(Blackhole blackhole, HorseRacingState horseRacingState) {
    blackhole.consume(HorseRacingService.strengthDifference(horseRacingState.strengths));
  }

  @Benchmark()
  public void testSortedStrengthDifference(Blackhole blackhole, HorseRacingState horseRacingState) {
    blackhole.consume(HorseRacingService.sortedStrengthDifference(horseRacingState.strengths));
  }
}
