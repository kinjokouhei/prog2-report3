package jp.ac.uryukyu.ie.e235725;

public class LivingThing {
    private String name;
    public String getName() {
        return name;
    }
    private int hitPoint;
    public int getHitPoint() {
        return hitPoint;
    }
    
    private int attack;
    public int getAttack() {
        return attack;
    }
    private boolean dead;
    public boolean isDead() {
        return dead;
    }
    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
    }
    public void attack(LivingThing opponent){
        if (dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
