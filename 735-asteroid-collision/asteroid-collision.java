class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int a: asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && a < 0 && stack.peek() > 0){
                int top = stack.peek();

                // top explodes
                if(top < -a){
                    stack.pop();

                // both explode
                } else if(top == -a){
                    stack.pop();
                    destroyed = true;
                    break;
                
                // current a explodes
                } else {
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                stack.push(a);
            }
        }

        // Convert stack to array
        int[] res = new int[stack.size()];
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = stack.pop();
        }
        return res;
    }
}