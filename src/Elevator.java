public abstract  class Elevator {
    private  Status status;
    Elevator(){
        status = Status.Свободен;
    }

    public  Status getStatus(){
        return status;
    }
    public  void setStatus(Status status){
        this.status = status;
    }
}
