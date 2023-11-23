public class Fish extends Thread{
    private Aqua aqua;
    private Gender gender;
    private int life;
    private int leftLife;
    private int x;
    private int y;

    public Fish(Gender gender, int life, int x, int y) {
        this.gender = gender;
        this.life = life;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < life; i++) {
                Thread.sleep(1000);
                swim();
                leftLife--;
            }
//            aqua.remove(this);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void swim() {
        // 1 - UP
        // 2 - LEFT
        // 3 - DOWN
        // 4 - RIGHT
        int direction = RandomUtil.randomNumber(4);
        switch(direction){
            case 1:
                if (y < Aqua.height){ y+=1; } break;
            case 2:
                if (x<Aqua.width){ x+=1; } break;
            case 3:
                if (y>0){ y-=1; } break;
            case 4:
                if (x>0){ x-=1; } break;
        }
    }

    public void setAqua(Aqua aqua) {
        this.aqua = aqua;
    }
//    public boolean equals(Fish fish){
//        if(x == fish.x && y = fish.y){
//            return true
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Fish{" +
                "aqua=" + aqua +
                ", gender=" + gender +
                ", life=" + life +
                ", leftLife=" + leftLife +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
