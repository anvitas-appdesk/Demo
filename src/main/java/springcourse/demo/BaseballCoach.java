package springcourse.demo;

public class BaseballCoach implements Coach {

  @Override
  public String getDailyWorkout(){
    System.out.println("Changes");
    return "Workout daily for 30 minutes";
  }


}
