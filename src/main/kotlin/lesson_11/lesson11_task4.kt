package lesson_11

class RecipeCategory(
    val nameOfCategory: String
)

class Ingredient(
    val nameOfIngredient: String,
    val measure: String,
)

class Recipe(
    val category: RecipeCategory,
    val name: String,
    val image: String,
    var numberOfPortion: Int,
    val mapOfIngredients: MutableMap<Ingredient, Int>,
    val methodOfPreparation: String,
    var favorite: Boolean = false
) {
    fun printRecipe() {
        println(name)
        println("Порции: $numberOfPortion")
        mapOfIngredients.forEach { (ingredient, quantity) ->
            println("${ingredient.nameOfIngredient} - $quantity ${ingredient.measure}")
        }
        println("Способ приготовления: \n$methodOfPreparation")
    }
}

fun main() {
    val burgers = RecipeCategory("Бургеры")
    val desserts = RecipeCategory("Десерты")
    val pizza = RecipeCategory("Пицца")
    val fish = RecipeCategory("Рыба")
    val soups = RecipeCategory("Супы")
    val salads = RecipeCategory("Салаты")

    val cheese = Ingredient(
        "Творог",
        "грамм",
    )

    val egg = Ingredient(
        "Куриное яйцо",
        "штуки",
    )

    val flour = Ingredient(
        "Пшеничная мука",
        "с.ложек",
    )

    val oil = Ingredient(
        "Подсолнечное масло",
        "с.ложек",
    )

    val sugar = Ingredient(
        "Сахар",
        "с.ложек",
    )

    val burgerCheeseAndMushrooms = Recipe(
        category = burgers,
        name = "Бургер с грибами и сыром",
        image = "Бургер_Сыр_Грибы.jpg",
        numberOfPortion = 1,
        mutableMapOf(
            cheese to 350,
            egg to 2,
            flour to 6,
            oil to 5,
            sugar to 2
        ),
        methodOfPreparation = "Рецепт_для_Бургер_Сыр_Грибы.txt"
    )

    burgerCheeseAndMushrooms.printRecipe()
}

