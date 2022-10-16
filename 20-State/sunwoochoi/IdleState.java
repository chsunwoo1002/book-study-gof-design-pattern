/* idle concrete state */
public class IdleState implements State {
  private BleMachine bleMachine;

  public IdleState(BleMachine bleMachine) {
    this.bleMachine = bleMachine;
  }

  // Idle state -> Search State
  @Override
  public void scan() {
    System.out.println("Start scanning");
    bleMachine.setState(bleMachine.getSearchState());    
  }

  // Idle state -> Idle state
  @Override
  public void connect() {
    System.out.println("Do scanning first");
  }

  // Idle state -> Idle state
  @Override
  public void disconnect() {
    System.out.println("No device is connected");
  }  
}
