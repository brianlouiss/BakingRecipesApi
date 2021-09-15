# Purpose 

the API should allow for a front end application to be able to create, update, delete and read baking (or cooking) logs from a database through a series of REST API endpoints. 

The overall vision would be to allow a baker or chef to log a recipe, and then once that recipe is logged allow them to log  notes and recipe changes for each bake after the initial one. A real life example would be when making a sourdough loaf. The initial recipe may change over time as flour, ratios, or techniques change. The app should allow for the baker to hit log bake, tie this new bake to the original recipe and then log everything that was in the original recipe. This will allow for the baker to track changes to the recipe over time and be able to go back to old ratios or techniques for an especially good outcome. Eventually we could also look into logging geographic information such as humidity, temperature, and weather for when the baker or chef was creating the recipe and track that to notice trends in outcomes. 

## End Points Required for Basic Functionality: 


### logRecipe

	* This should allow you to log a recipe, a basic recipe is required to have the following:
		* Ingredients, with measurements
		* Steps
		* Title
		* Duration
		* Servings
	* A stretch goal of being able to log pictures would be good. A picture could be tied to a step or the end product.
	
### retrieveRecipe 

This should be a GET request to retrieve one, or all, of a recipes historical instances

### deleteRecipe 

Delete one or all of a specific recipe

### updateRecipe 

This will allow you to edit one instance of a recipe
