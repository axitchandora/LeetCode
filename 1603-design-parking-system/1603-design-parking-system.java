class ParkingSystem {
    private static int big;
    private static int medium;
    private static int small;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1)return big-->0;
        if(carType==2)return medium-->0;
        if(carType==3)return small-->0;
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */