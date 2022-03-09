public class Elevator {
    private int floor;
    private int floorMax;
    private int floorMin;
    private int targetFloor;
    private double integrity = 100;

    public Elevator(int floorMin, int floorMax, int floor) {
        this.floorMin = floorMin;
        this.floorMax = floorMax;
        this.floor = floor;
    }

    private void floorUp(int targetFloor) throws InterruptedException {
        if (!controller(targetFloor)) {
            for (; floor < targetFloor; floor++) {
                wearUp();
                InternalProcesses.timer();
                wearDown();
                zeroUp();
                System.out.println("Текущий этаж: " + getFloor());
            }
        }
    }

    private void floorDown(int targetFloor) throws InterruptedException {
        if (!controller(targetFloor)) {
            for (; floor > targetFloor; floor--) {
                wearUp();
                InternalProcesses.timer();
                wearDown();
                zeroDown();
                System.out.println("Текущий этаж: " + getFloor());
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

    private void wearDown() {
        integrity = integrity - InternalProcesses.wear();
    }

    private void wearUp() throws InterruptedException {
        if (getIntegrity() < 50) {
            System.out.println("Упс я сломался, чинюсь.........: )))))");
            integrity = integrity + integrity * 0.9;
            Thread.sleep(10000);
            System.out.println("Был произведен ремонт, текущее состояние: " + getIntegrity() + " %");
        }
    }

    public double getIntegrity() {
        return integrity;
    }

    public void controlPanel(int targetFloor) throws InterruptedException {
        targetFloor = targetFloor == 0 ? 1 : targetFloor;
        if (!controller(targetFloor)) {
            if (targetFloor >= floor) {
                floorUp(targetFloor);
            }
            if (targetFloor <= floor) {
                floorDown(targetFloor);
            }
            if (getFloor() == targetFloor) {
                System.out.println("Вы приехали! Текущий этаж: " + getFloor());
            }
        }
    }

    private boolean controller(int targetFloor) {
        if (targetFloor > floorMax || targetFloor < floorMin) {
            System.out.println("Такого этажа не существует " +
                    "ведите правильный этаж в диапазоне от : " +
                    floorMin + " до " + floorMax);
            return true;
        }
        return false;
    }
}
