/**
 * Created by Paul on 15/12/2015.
 */
public class Node{
    Node parent;
    Node left;
    Node right;
    Integer value;

    Node(){}

    Node(Integer a){
        this.value = a;
    }

    public Node insert(Integer i){
        if(this.parent == null){
            this.parent = new Node(i);
            return null;
        }
        if(i >= this.value){
            if(right == null){
                new Node(i);
                return null;
            } else {
                right.insert(i);
            }
        }

        if(i < this.value){
            if(parent.left == null){
                new Node(i);
            } else {
                left.insert(i);
            }
        }
        return null;
    }






}
