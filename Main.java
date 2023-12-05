public class Main {
    public static void main(String [] args){
        
        Add s = (x, y) -> {
            int result = 0;
            for(int i = x; i <= y; i++){
                result += i;
            }

            return result;
        }; 
    }
}
