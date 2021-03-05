package mgramacho.ood.solid.liskov;

public class Animal {
    private String favoriteFood;

    public Animal(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
