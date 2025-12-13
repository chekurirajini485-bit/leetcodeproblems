class Solution {
    public int trap(int[] height) {
        // 1. Initialize two pointers at the extreme ends of the elevation map
        //    🏔️ We start our exploration from both ends!
        int left = 0;
        int right = height.length - 1;
        
        // 2. Track the maximum heights encountered so far from each side
        //    🏗️ These represent our "water containment walls"
        int leftMax = height[left];
        int rightMax = height[right];
        
        // 3. This will accumulate our total trapped water
        //    💧 Starting with zero water trapped
        int water = 0;

        // 4. Main loop: Continue until our two explorers meet in the middle
        //    🔁 The explorers march toward each other!
        while (left < right) {
            
            // 5. THE CRITICAL DECISION: Which side has the shorter current wall?
            //    🎯 The shorter wall determines where we can safely calculate water!
            if (leftMax < rightMax) {
                // 6. Move the left explorer one step to the right
                //    👣 March forward!
                left++;
                
                // 7. Update our left wall height if we found a taller building
                //    🏗️ "If this building is taller, it becomes our new wall!"
                leftMax = Math.max(leftMax, height[left]);
                
                // 8. Calculate water trapped at current position
                //    💧 Water level = leftMax, minus ground height = trapped water!
                water += leftMax - height[left];
            } else {
                // 9. Symmetric processing for the right side
                //    🪞 Mirror logic - same process but from the right!
                right--;
                
                // 10. Update right wall height
                //     🏗️ Keep track of the tallest building seen from right
                rightMax = Math.max(rightMax, height[right]);
                
                // 11. Calculate water trapped at current position
                //     💧 Same formula, different side!
                water += rightMax - height[right];
            }
        }
        
        // 12. Return the total trapped water
        //     🎉 Mission accomplished!
        return water;
    }
}