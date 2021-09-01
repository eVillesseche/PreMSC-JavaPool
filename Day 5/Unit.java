public abstract class Unit implements Fighter{
    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter closeTo; 
    
    protected Unit(String name,int hp, int ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public String getName(){
        return this.name;
    }
    public int getAp(){
        return this.ap;
    }
    public int getHp(){
        return this.hp;
    }

    public void receiveDamage(int damage){
        if(this.hp - damage < 0){
            this.hp = 0;
        }
        else{
            this.hp -= damage;
        }
    }

    public boolean moveCloseTo(Fighter target){
        if(this.closeTo != target && this != target){
            System.out.println(this.name + " is moving closer to " + target.getName() + ".");
            this.closeTo = target;
            return true;
        }
        else{
            return false;
        }
    }

    public void recoverAP(){
        if( this.ap > 43){
            this.ap = 50;
        }
        else{
            this.ap += 7;
        }
    }

}
