package core;

public class Utils {

    public static boolean sleep(long lTime){
        try{
            Thread.sleep(lTime);
        } catch(Exception e){
            return false;
        }
        return true;
    }
}
