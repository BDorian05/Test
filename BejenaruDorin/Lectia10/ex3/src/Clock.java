public class Clock {
    int hours;
    int minutes;

    public void next() {
        int total=minutes +1;
        if (total == 60){
            hours++;
            minutes =0;
        }else {
            minutes++;
        }
        System.out.println("Time is " + this.hours + ":" + this.minutes);
        }
}
