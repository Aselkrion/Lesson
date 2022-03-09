public class GearBox {
    /**
     * 0 - neutral
     * 1 - rear
     * 1 - 6
     */
    private int maxGear = 6;
    private int minGear = 1;
    private int gear = 0;

    public void shiftUp(){
        gear = gear < maxGear ? gear++ : gear;
    }

    public void shiftDown(){
        gear = gear > minGear ? gear-- : gear;
    }

    public void switchRear(){
        gear = (gear > 1) ? gear  : gear--;
    }

    public void switchNeutral(){
        gear = 0;
    }

    public int getCurrentGear(){
        return gear;
    }

}
