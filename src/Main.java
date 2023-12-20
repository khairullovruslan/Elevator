
public class Main {
    public static void main(String[] args) {
        ElevatorEvenFloor even1 = new ElevatorEvenFloor();
        ElevatorEvenFloor even2 = new ElevatorEvenFloor();
        ElevatorEvenFloor even3 = new ElevatorEvenFloor();
        ElevatorOddFloor odd1 = new ElevatorOddFloor();
        ElevatorOddFloor odd2 = new ElevatorOddFloor();
        ElevatorOddFloor odd3 = new ElevatorOddFloor();
        ElevatorForEmployees employerEl = new ElevatorForEmployees();
        ElevatorEvenFloor[] evenFloors = {even1, even2, even3};
        ElevatorOddFloor[] oddFloors = {odd1, odd2, odd3};

        CallElevator call = new CallElevator(evenFloors, oddFloors, employerEl);
            try {
                Elevator el = call.callTheElevator(ElevatorType.нечетный);
                System.out.println(el);
            }
            catch (InvalidNoEmptyElevators e){
                System.out.println("Нет пустых лифтов");
            }





    }
}