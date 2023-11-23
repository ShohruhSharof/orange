public class FishFactory {
    public static Fish createFish(){
        Gender gender = randomGender();
        int life  = RandomUtil.randomNumber(10,30);
        int x = RandomUtil.randomNumber(Aqua.width);
        int y = RandomUtil.randomNumber(Aqua.height);
        Fish fish = new Fish(gender,life,x,y);
    return fish;
    }
    public static Gender randomGender(){
        int gender  = RandomUtil.randomNumber(2);
        return gender == 1 ? Gender.Male:Gender.Fmale;
    }
}
