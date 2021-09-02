public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,45));

    }
    public static boolean isCatPlaying (boolean summer,int temperature){
        int upperTemp = summer ? 45 : 35;
        if(temperature>=25 && temperature<=upperTemp){
            return true;
        }
        return false;
    }

}
