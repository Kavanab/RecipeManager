app.service('Recipes', ['$http', function($http) {
    return {
        getAllRecipes: function() {
            var URI = "http://localhost:8080/recipe";
            return $http.get(URI);
        },

        postRecipe: function(recipe) {
            URI = "http://localhost:8080/recipe";
            return $http.post(URI, recipe);
        }
    };

}])