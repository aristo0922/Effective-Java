package ch06.item37;

import static java.util.stream.Collectors.groupingBy;

import ch06.item37.Plant.LifeCycle;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RunTest {

  public static void main(String[] args) {
    List<Plant> garden = initGarden();

    ordinalAsArrayIndex(garden);
    System.out.println("--- 구분선 ---");
    enumMapping(garden);

//    System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle)));
    System.out.println();
    streamV1(garden);
    streamV2(garden);
  }

  public static void streamV1(List<Plant> garden) {
    Map plantsByLifeCycle = garden.stream().collect(Collectors.groupingBy(plant -> plant.lifeCycle));
    System.out.println(plantsByLifeCycle);
  }

  public static void streamV2(List<Plant> garden) {
    Map plantsByLifeCycle = garden.stream()
        .collect(Collectors.groupingBy(plant -> plant.lifeCycle,
            () -> new EnumMap<>(LifeCycle.class), Collectors.toSet()));
    System.out.println("스트림 사용 Map");
    System.out.println(plantsByLifeCycle);
  }

  public static void enumMapping(List<Plant> garden){
    Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

    for (Plant.LifeCycle lc: Plant.LifeCycle.values())
      plantsByLifeCycle.put(lc, new HashSet<>());

    for (Plant p : garden)
      plantsByLifeCycle.get(p.lifeCycle).add(p);

    System.out.println(plantsByLifeCycle);
  }

  public static List<Plant> initGarden(){
    Plant corn = new Plant("옥수수", LifeCycle.ANNUAL);
    Plant pea = new Plant("완두", LifeCycle.ANNUAL);
    Plant potato = new Plant("감자", LifeCycle.PERENNIAL);
    Plant alceaRosea = new Plant("접시꽃", LifeCycle.BIENNIAL);

    return Arrays.asList(corn, alceaRosea, pea, potato);
  }

  //not recommended
  public static void ordinalAsArrayIndex(List<Plant> garden){
    Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

    for (int i = 0; i < plantsByLifeCycle.length; i++)
      plantsByLifeCycle[i] = new HashSet<>();

    for(Plant p : garden)
      plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);

    for (int i = 0; i < plantsByLifeCycle.length; i++)
      System.out.println(Plant.LifeCycle.values()[i] + ": "+ plantsByLifeCycle[i]);
  }

}
