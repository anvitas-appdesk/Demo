package springcourse.demo;

public class BaseballCoach implements Coach {

  @Override
  public String getDailyWorkout(){
    return "Workout daily for 30 minutes";
  }

}
