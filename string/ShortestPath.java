// package string;

public class ShortestPath {
    
    public static float getShortestPath(String path){
        int x =0, y=0;
        for(int i =0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir =='S'){
                y--;
            }
            //north
            if(dir =='N'){
                y++;
            }
            //east
            if(dir =='E'){
                x++;
            }
            //west
            if(dir =='W'){
                x--;
            }
            
        }
        int xSquare = x*x;
        int ySquare = y*y;
        return  (float)Math.sqrt(xSquare + ySquare);
    }
    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        float distance = getShortestPath(direction);
        System.out.println(distance);
    }
    
}
