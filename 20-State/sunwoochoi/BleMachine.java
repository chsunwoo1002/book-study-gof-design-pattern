/* Context */
public class BleMachine {
  private State readyState;
  private State idlState;
  private State searchState;

  private State curState;

  public BleMachine() {
    this.curState = new IdleState(this);
    this.readyState = new ReadyState(this);
    this.idlState = new IdleState(this);
    this.searchState = new SearchState(this);
  }

  public void scan() {
    curState.scan();
  }

  public void connect() {
    curState.connect();
  }
  
  public void disconnect() {
    curState.disconnect();
  }

  public void setState(State state) {
    curState = state;
  }

  public State getReadyState() {
    return readyState;
  }

  public State getIdleState() {
    return idlState;
  }

  public State getSearchState() {
    return searchState;
  }
}
