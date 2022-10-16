public class Client {
  public static void main(String[] args) {
    BleMachine stateMachine = new BleMachine();

    stateMachine.scan(); // Start scanning
    stateMachine.disconnect(); // Stop scanning and go back to idle
    stateMachine.scan(); // Start scanning
    stateMachine.connect(); // Try to connect a device
    stateMachine.disconnect(); // Disconnect the device and go back to idle
  }
}