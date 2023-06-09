public class Vehicle {

    public int velocity;
    public int time;

    public Vehicle(int velocity, int time){
        this.velocity = velocity;
        this.time = time;
    }
    public int getSpeed(){
        return velocity/time;
    }
}
