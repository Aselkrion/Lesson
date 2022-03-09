public class Elevator {
    private int floor;
    private int floorMax;
    private int floorMin;
    private int targetFloor;

    public Elevator(int floorMin, int floorMax, int floor) {
        this.floorMin = floorMin;
        this.floorMax = floorMax;
        this.floor = floor;
    }

    private void floorUp(int targetFloor) {
        if(!controller(targetFloor)){
            for ( ; floor < targetFloor; floor ++){
                InternalProcesses.timer();
                zeroUp();
                System.out.println("Текущий этаж: " + getFloor());
            }
            if (getFloor() == targetFloor) {
                System.out.println("Вы приехали! Текущий этаж: " + getFloor());
            }
        }
    }

    private void floorDown(int targetFloor) {
        if(!controller(targetFloor)){
            for ( ; floor > targetFloor; floor --){
                InternalProcesses.timer();
                zeroDown();
                System.out.println("Текущий этаж: " + getFloor());
            }
            if (getFloor() == targetFloor) {
                System.out.println("Вы приехали! Текущий этаж: " + getFloor());
            }
        }
    }

    private void zeroUp() {
        floor = floor == 0 ? 1 : floor;
    }

    private void zeroDown() {
        floor = floor == 0 ? -1 : floor;
    }

    private int getFloor() {
        return floor;
    }

    public void controlPanel(int targetFloor){
        if (!controller(targetFloor)){
            if(targetFloor >= floor){
                floorUp(targetFloor);
            } else {
                floorDown(targetFloor);
            }
        }
    }

    private boolean controller(int targetFloor){
        if(targetFloor > floorMax || targetFloor < floorMin){
            System.out.println("Такого этажа не существует " +
                    "ведите правильный этаж в диапазоне от : " +
                    floorMin + " до " + floorMax);
            return true;
        }
        return false;
    }
}
