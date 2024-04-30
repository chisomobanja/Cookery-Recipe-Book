package shell;
// Define the Recipe class
class Recipe {
    // Attributes
    private String title;
    private String[] ingredients;
    private String instructions;
    private int cookingTime; // in minutes
    private String cuisine;

    // Constructor
    public Recipe(String title, String[] ingredients, String instructions, int cookingTime, String cuisine) {
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cookingTime = cookingTime;
        this.cuisine = cuisine;
    }

    // Method to display recipe details
    public void displayRecipe() {
        System.out.println("Title: " + title);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Instructions: " + instructions);
        System.out.println("Cooking Time: " + cookingTime + " minutes");
        System.out.println("Cuisine: " + cuisine);
        System.out.println();
    }
}

// Main class to test the Recipe class
public class Main {
    public static void main(String[] args) {
        // Create instances of Recipe
        Recipe pastaRecipe = new Recipe(
            "Spaghetti Carbonara",
            new String[]{"Spaghetti", "Eggs", "Bacon", "Parmesan Cheese", "Black Pepper"},
            "1. Cook spaghetti according to package instructions.\n2. In a pan, fry bacon until crispy.\n3. Beat eggs and mix in grated Parmesan cheese.\n4. Drain cooked spaghetti and mix with egg and cheese mixture.\n5. Add crispy bacon and black pepper. Serve immediately.",
            20,
            "Italian"
        );

        Recipe stirFryRecipe = new Recipe(
            "Vegetable Stir Fry",
            new String[]{"Broccoli", "Carrots", "Bell Peppers", "Onion", "Soy Sauce", "Garlic", "Ginger"},
            "1. Heat oil in a pan.\n2. Add minced garlic and ginger, sauté until fragrant.\n3. Add chopped vegetables and stir-fry until tender-crisp.\n4. Season with soy sauce.\n5. Serve hot.",
            15,
            "Asian"
        );

        // Display recipe details
        System.out.println("Recipe 1:");
        pastaRecipe.displayRecipe();

        System.out.println("Recipe 2:");
        stirFryRecipe.displayRecipe();
    }
}