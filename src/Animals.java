public class Animals {
    String name;
    String family;
    int lifeExpectancy;

    //констуктор
    public Animals(String name, String family, int lifeExpectancy) {
        this.name = name;
        this.family = family;
        this.lifeExpectancy = lifeExpectancy;
    }

    // геттеры
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    // сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    //Метод (функция) вывода на печать.
    String getInfo() {
        return "Название животного - " + this.name + ". Семейство - " + this.family + ". Продолжительность жизни - " + this.lifeExpectancy + " лет.";
    }
}
