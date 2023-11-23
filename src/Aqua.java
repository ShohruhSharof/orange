import java.util.concurrent.ConcurrentHashMap;

public class Aqua {
    private ConcurrentHashMap<String,Fish> fishMap = new ConcurrentHashMap<>();
    public static int width = 5;
    public static int height = 5;
    public static int fishLimit = (width+1)*(height+1);
    public void start()throws InterruptedException{
        int numberOfFish = RandomUtil.randomNumber(5,10);
        System.out.println("Aquarium start of Fish: " +numberOfFish);
        for (int i = 0; i < numberOfFish; i++) {
            Fish fish = FishFactory.createFish();
            fish.setAqua(this);
            fishMap.put(fish.getName(),fish);
            fish.start();
        }
        printAquaDetail();
        waitUntilAllFishDied();

    }
    private void waitUntilAllFishDied(){
        while(fishMap.size()!=0){
            for (Fish fish:fishMap.values() ) {
                if (fish.getState().equals(Thread.State.NEW)){
                    fish.start();
                    System.out.println("New Fish Born: "+fish+" "+fishMap.size());
                    printAquaDetail();
                }

            }
        }
        System.out.println("Fish left in Aquarium!");
    }

    private void printAquaDetail() {
    }

}
