package package1.data;

public class Customer {
    private String name;
    private Level level;
    
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLevel (Level level){
        this.level = level;
    }
    public Level getLevel(){
        return this.level;
    }
}
