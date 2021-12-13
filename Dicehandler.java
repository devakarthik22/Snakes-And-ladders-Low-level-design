

public class Dicehandler {
    int noOfdice;
    Dicehandler(int x){
        noOfdice=x;
    }
    public int rolldice( ){
        if(noOfdice>1){
            int x=(int) ((Math.random()*(5*(noOfdice)))+1);
            return x;
        }
        else{
            int x=(int) ((Math.random()*(5*(noOfdice)))+1);
            int c=1;
            while(x==6 && c<=3){
                x=(int) ((Math.random()*(5*(noOfdice)))+1);
                if(x==6){
                    c++;
                }
            }
            if(c==3){
                System.out.println("You have got six three times in a row.");
                return 0;
            }
            else{
                return x;
            }


        }

    }

    
}
