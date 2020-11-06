interface Burger {
    static void returnCalories() {

    }
    static void returnIngredients() {

    }
}

interface Fries {
    static void returnCalories() {

    }
    static void eatLoudly() {

    }
}

class McDonaldsFryBurger implements Burger, Fries {
    static void returnCalories() {

    }
    static void returnIngredients() {

    }
    static void eatLoudly() {

    }
    public static void main(String[] args) {
        McDonaldsFryBurger info = new McDonaldsFryBurger();
        info.returnCalories();
        Burger.returnCalories();
        Fries.returnCalories();

        info.returnIngredients();
        Burger.returnIngredients();

        info.eatLoudly();;
        Fries.eatLoudly();

    }
}