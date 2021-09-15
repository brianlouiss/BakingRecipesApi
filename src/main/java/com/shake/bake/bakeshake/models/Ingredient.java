package com.shake.bake.bakeshake.models;

import java.util.Set;

public class Ingredient {
    private Long id;
    private String ingredientName;
    // Use a unique set of tags to tag food
    // for different categories of food.
    private Set<Tag> tags;
}
