class ParkingSystem {
    private int big;
    private int medium;
    private int small;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }
    
    public boolean addCar(int carType) {
        switch(carType){
            case 1:return big-->0;
            case 2:return medium-->0;
            case 3:return small-->0;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */