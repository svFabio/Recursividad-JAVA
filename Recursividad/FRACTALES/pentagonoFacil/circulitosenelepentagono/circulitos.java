
/**
 loss circulos de pentagonos 
 */
public class circulitos{
    public int circulos(int nivel) {
        return circulos(nivel,0);
    }
    private int circulos(int nivel, int mult){
        
        
        
        
        if(nivel ==  1){
            return 1;
        }else{
            return circulos(nivel-1,mult+1)+ 4 + 3 * mult ;
        }
    }
}
