
/**
 *  num1 = 3452345 ; num2 = 4325432 n = 7
 *  
 *  es TRUE, suma digito con digito correspondiente y tiene que salir 7 o lo que sea n
 *  
 */
public class complemento{
    public boolean complementoAN(int num1, int num2, int n){
        boolean res;
        if(num1<10 && num2<10){
            if(num1 + num2 == n){
                res = true;
            }else{
                res = false;
            }
        }else{
            if(num1%10 + num2%10 == n){
                res = complementoAN(num1/10,num2/10,n);
            }else{
                res = false;
            }
        }
        return res;
    }
    
}
