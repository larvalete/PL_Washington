public class week1_0B {

class IntBinaryTree {
    int i;
    IntBinaryTree left;
    IntBinaryTree right;

    IntBinaryTree(int _i, IntBinaryTree _left, IntBinaryTree _right) {
        i = _i;
        left = _left;
        right = _right;
    }

    int sumAll()    {
        int ans = this.i;
        if(left != null)
            ans = ans + left.sumAll();
        if(right != null)
            ans = ans + right.sumAll();
        return ans;
    }


    // assumes array ha at least one element
    static int maxArray(int [] array)   {
        int ans = array[0];
        for(int i=0; i < array.length; i++) {
            if(array[i] > ans)
                ans = array[i];
        }
        return ans;
    }
}

public static void main(String[] args) {
    week1_0B outer = new week1_0B();

    // Example usage of IntBinaryTree
    IntBinaryTree tree = outer.new IntBinaryTree(1, 
        outer.new IntBinaryTree(2, null, null), 
        outer.new IntBinaryTree(3, null, null));

    System.out.println("Sum of all values in the tree: " + tree.sumAll());

    // Example usage of maxArray
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Maximum value in the array: " + IntBinaryTree.maxArray(arr));
}

}
