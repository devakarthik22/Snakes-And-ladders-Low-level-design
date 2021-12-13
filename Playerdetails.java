public class Playerdetails {
    private String name;
    private int x;
    Playerdetails(String name){
        this.name=name;
        x=0;
    }
    public int getlocation(){
        return x;
    }
    public void setlocation(int y){
        x=y;
    }
    public String getname(){
        return name;
    }
    
}
