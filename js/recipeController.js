app.controller("recipeController", ['$scope', 'Recipes', function($scope, Recipes) {
    $scope.hideWelcome = false;
    $scope.addRecipeForm = false;
    $scope.newRecipe = {};
    $scope.recipeList = [];

    Recipes.getAllRecipes().then(function(response) {
        console.log(response);
        $scope.recipeList = response.data;
    });

    $scope.addNewRecipe = function() {
        $scope.hideWelcome = true;
        $scope.addRecipeForm = true;
        $scope.success = false;
        $scope.recipeSelected = null;
    };

    $scope.change = function() {
        $scope.hideWelcome = true;
        $scope.addRecipeForm = false;
    }

    $scope.submitRecipe = function() {
        if ($scope.newRecipe.name != null && ($scope.newRecipe.ingredient1 || $scope.newRecipe.ingredient2 ||
                $scope.newRecipe.ingredient3 || $scope.newRecipe.ingredient4) != null) {
            Recipes.postRecipe($scope.newRecipe).then(function(response) {
                if (response.status === 200) {
                    $scope.recipeList.push(response.data);
                    $scope.success = true;
                    $scope.newRecipe = {};
                } else {
                    alert("Some error while submitting the recipe");
                }
            });
        } else {
            alert("Please fill at least one ingredient with name");
        }
    }

    $scope.cancel = function() {
        $scope.newRecipe = {};
    }

}]);