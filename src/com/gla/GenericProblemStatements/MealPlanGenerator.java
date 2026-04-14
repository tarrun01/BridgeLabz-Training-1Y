package com.gla.GenericProblemStatements;
import java.util.List;

interface MealPlan {
    String getPlanName();
    List<String> getMeals();
}

class VegetarianMeal implements MealPlan {
    public String getPlanName() { return "Vegetarian"; }
    public List<String> getMeals() {
        return List.of("Paneer Curry", "Dal Tadka", "Vegetable Biryani");
    }
}

class VeganMeal implements MealPlan {
    public String getPlanName() { return "Vegan"; }
    public List<String> getMeals() {
        return List.of("Tofu Stir Fry", "Lentil Soup", "Quinoa Salad");
    }
}

class KetoMeal implements MealPlan {
    public String getPlanName() { return "Keto"; }
    public List<String> getMeals() {
        return List.of("Grilled Chicken", "Avocado Salad", "Boiled Eggs");
    }
}

class HighProteinMeal implements MealPlan {
    public String getPlanName() { return "High-Protein"; }
    public List<String> getMeals() {
        return List.of("Chicken Breast", "Protein Shake", "Greek Yogurt");
    }
}

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void display() {
        System.out.println("Plan: " + mealPlan.getPlanName());
        System.out.println("Meals: " + mealPlan.getMeals());
    }
}

public class MealPlanGenerator {

    public static <T extends MealPlan> Meal<T> generatePlan(T plan) {
        System.out.println("Generating " + plan.getPlanName() + " meal plan...");
        return new Meal<>(plan);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = generatePlan(new VegetarianMeal());
        vegMeal.display();

        Meal<VeganMeal> veganMeal = generatePlan(new VeganMeal());
        veganMeal.display();

        Meal<KetoMeal> ketoMeal = generatePlan(new KetoMeal());
        ketoMeal.display();

        Meal<HighProteinMeal> highProteinMeal = generatePlan(new HighProteinMeal());
        highProteinMeal.display();
    }
}
