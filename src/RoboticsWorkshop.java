public class RoboticsWorkshop extends Workshop{
        private static final int FEE = 18;
        @Override
        public int getFeePerSeat(){
            return FEE;
        }
        public RoboticsWorkshop (String title, int capacity){
            super(title, capacity);
        }
    }
