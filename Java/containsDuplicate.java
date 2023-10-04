class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> Unique = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(Unique.contains(nums[i]))
            {
                return true;
            }
            Unique.add(nums[i]);
        }
        return false;
    }
}