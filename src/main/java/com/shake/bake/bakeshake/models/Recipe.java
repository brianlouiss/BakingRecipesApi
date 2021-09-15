package com.shake.bake.bakeshake.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Recipe {
    private Long id;
    private String title;
    private int version;
    private LocalDateTime duration;
    private int servings;
    private List<Step> steps;
    private List<Ingredient> ingredients;
    private List<String> notes;
    private Set<Tag> tags;
}
