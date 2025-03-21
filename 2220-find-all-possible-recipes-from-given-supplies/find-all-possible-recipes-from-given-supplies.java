import java.util.*;

class Solution {
    public List<String> findAllRecipes(
        String[] recipes, List<List<String>> ingredients, String[] supplies) {
        
        // Convert supplies array to a set for quick lookup
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        
        // Graph adjacency list and in-degree map
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> inDegree = new HashMap<>();
        
        // Initialize graph and in-degree
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            inDegree.put(recipe, ingredients.get(i).size()); // Set initial in-degree count
            
            for (String ingredient : ingredients.get(i)) {
                graph.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipe);
            }
        }
        
        // Queue for topological sorting
        Queue<String> queue = new LinkedList<>();
        
        // Start with supplies (initially available ingredients)
        for (String supply : supplies) {
            queue.offer(supply);
        }
        
        List<String> result = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            
            // If the current ingredient is a recipe, add to result
            if (inDegree.containsKey(current)) {
                result.add(current);
            }
            
            // Process dependents (recipes that use this ingredient)
            if (graph.containsKey(current)) {
                for (String dependent : graph.get(current)) {
                    inDegree.put(dependent, inDegree.get(dependent) - 1);
                    
                    // If all ingredients for a recipe are available, add to queue
                    if (inDegree.get(dependent) == 0) {
                        queue.offer(dependent);
                    }
                }
            }
        }
        
        return result;
    }
}
