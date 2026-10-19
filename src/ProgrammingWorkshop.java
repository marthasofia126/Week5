public class ProgrammingWorkshop extends Workshop {
    private static final int FEE = 12;
    @Override
    public int getFeePerSeat(){
        return FEE;
    }
    public ProgrammingWorkshop (String title, int capacity){
        super(title, capacity);
    }
}
