import java.nio.channels.Pipe;

/* implementation of ready state that it is connected to ble device */
public class ReadyState implements State {
  private BleMachine bleMachine;

  public ReadyState(BleMachine bleMachine) {
    this.bleMachine = bleMachine;
  }

  // Ready state -> Search state
  @Override
  public void scan() {
    System.out.println("Disconnect the device and scanning again");  
    bleMachine.setState(bleMachine.getSearchState());
  }

  // Ready state -> ready state
  @Override
  public void connect() {
    System.out.println("Already connected");
  }

  // Ready state -> Idle state
  @Override
  public void disconnect() {
    System.out.println("Disconnect the device and go back to idle");
    bleMachine.setState(bleMachine.getIdleState());
  }
  
}
