public class Horse {
    String name;
    String breed;
    int cost;

    //констуктор
    public Horse(String name, String breed, int cost) {
        this.name = name;
        this.breed = breed;
        this.cost = cost;
    }

    // Метод - для вывода информации
    String getInfo () {
        return "Кличка лошади - " + this.name + ". Порода лошади - " + this.breed + ". Стоимость лошади - " + this.cost + "$";
    }

    //геттеры
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getCost() {
        return cost;
    }

    //сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}




