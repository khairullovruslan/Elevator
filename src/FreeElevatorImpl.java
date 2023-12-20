public class FreeElevatorImpl implements FreeElevator{

    private Node root;
    private Node current;
    public FreeElevatorImpl(Elevator[] elevs) {
        current = new Node(elevs[0]);
        root = current;
        for (int i = 1; i <= 2;++i){
            current.next = new Node(elevs[i]);
            current = current.next;
        }
        current.next = root;
    }
    @Override
    public Elevator free() throws InvalidNoEmptyElevators {
        for(int i = 0; i < 3;++i){
            if (current.value.getStatus() == Status.Свободен){
                current.value.setStatus(Status.Занят);
                current.next.value.setStatus(Status.Свободен);
                return current.value;
            }
            next();
        }
        throw new  InvalidNoEmptyElevators();
    }

    public  Elevator next(){
        current = current.next;
        return current.value;
    }

}

