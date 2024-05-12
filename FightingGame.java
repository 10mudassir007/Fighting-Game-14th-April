class Fighter {
    private int attackPower;
    private int health;
    private String name;

    public Fighter(String name,int hp,int attack) {
        this.name = name;
        this.health = hp;
        this.attackPower = attack;
    }

    public void attack(Fighter oppenent) {
        oppenent.health -= this.attackPower;
        if (this.health > 0 && oppenent.health >0){
        System.out.println(this.name + " Attacks "+ oppenent.name + " for " + this.attackPower + " damage");}
    }
    public boolean isAlive() {
        return health > 0;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
}

public class FightingGame {
    public static void main(String[] args) {
        Fighter player1 = new Fighter("Ryu", 1500, 45);
        Fighter player2 = new Fighter("Ken", 1590, 60);

        while (player1.isAlive() && player2.isAlive()) {
            player1.attack(player2);
            if (!player2.isAlive()){ 
                break;}    

                player2.attack(player1);
            if (!player1.isAlive()){ 
                break;}            
                  
        
            
            System.out.println("Remaining Health:");
            System.out.println("Name:"+player1.getName()+" Health:"+player1.getHealth());
            System.out.println("Name:"+player2.getName()+" Health:"+player2.getHealth());
        }
        if (player1.isAlive()) {
            System.out.println(player1.getName()+" Wins!, FATALITY");
        }
        else {
            System.out.println(player2.getName()+" Wins!, FATALITY");
        }
    
}}
