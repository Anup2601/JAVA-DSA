class linear{
     
    public static void main(String[] args) {
        // Define the item to search for in the list
        int item=54;

        // Variable to store the index of the found item (initially 0)
        int a=0;
        // Define an array of integers to search through
        int list[]={1,2,3,4,5,6,78,899,54,8,345};
        // Iterate over the list to find the index of the item
        for (int i = 0; i <list.length; i++) {
            // If the item is found, store its index in 'a'
            if(list[i]==item){
                a=i;
            }
        }
        // Print the result: the index of the item in the list
        System.out.println("the index of "+item+" is "+a);

    }
}