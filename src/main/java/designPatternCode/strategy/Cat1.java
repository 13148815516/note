package designPatternCode.strategy;

public class Cat1  {
    int weight, height;

    public Cat1(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat1 c) {

        if(this.weight < c.weight) return -1;
        else if(this.weight > c.weight) return 1;
        else return 0;
    }

}
