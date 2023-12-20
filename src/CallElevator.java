public class CallElevator  implements  Call{
    private  ElevatorForEmployees currentForEmpl;

    private FreeElevatorImpl findFreeOdd;
    private FreeElevatorImpl findFreeEven;
    CallElevator(ElevatorEvenFloor[] evens, ElevatorOddFloor[] odds, ElevatorForEmployees employer){
        currentForEmpl = employer;
        findFreeOdd = new FreeElevatorImpl(odds);
        findFreeEven = new FreeElevatorImpl(evens);


    }
    @Override
    public Elevator callTheElevator(ElevatorType elev) throws InvalidNoEmptyElevators {
        if (elev == ElevatorType.сотрудник){
            return checkFreeElevatorsForEmpl();
        }
        if (elev == ElevatorType.четный){
            return checkFreeEvenElevators();
        }
        if (elev == ElevatorType.нечетный){
            return checkFreeOddElevators();
        }
        return null;

    }

    public ElevatorForEmployees checkFreeElevatorsForEmpl() throws InvalidNoEmptyElevators {
        if (currentForEmpl.getStatus() ==  Status.Свободен){
            return currentForEmpl;
        }
        throw new  InvalidNoEmptyElevators();
    }
    public ElevatorEvenFloor checkFreeEvenElevators() throws InvalidNoEmptyElevators {
        currentForEmpl.setStatus(Status.Свободен);
        return (ElevatorEvenFloor) findFreeEven.free();

    }
    public ElevatorOddFloor checkFreeOddElevators() throws InvalidNoEmptyElevators {
        return (ElevatorOddFloor) findFreeOdd.free();

    }

}
