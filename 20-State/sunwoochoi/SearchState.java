/* implementation of search state while searching connectable devices */
public class SearchState implements State {
  private BleMachine bleMachine;

  public SearchState(BleMachine bleMachine) {
    this.bleMachine = bleMachine;
  }

  // Search state -> Search state
  @Override
  public void scan() {
    System.out.println("Scanning devices again");
  }

  // Search state -> Ready state
  @Override
  public void connect() {
    System.out.println("Try to connect a device");
    bleMachine.setState(bleMachine.getReadyState());
  }

  // Search state -> idle state
  @Override
  public void disconnect() {
    System.out.println("Stop scanning and go back to idle");
    bleMachine.setState(bleMachine.getIdleState());
  }
  
}
