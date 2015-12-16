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

    public Node(Node n) {
        this.parent = n.parent;
        this.left = n.left;
        this.right = n.right;
        this.value = n.value;
    }

    public Node insert(Node i){
        if(this.parent == null){
            this.parent = new Node(i);
            return null;
        }
        if(i.value >= this.value){
            if(right == null){
                right = new Node(i);
                right.parent = this;
                return null;
            } else {
                return this.right.insert(i);
            }
        }

        if(i.value < this.value){
            if(this.left == null){
                left = new Node(i);
                left.parent = this;
                return null;
            } else {
                return this.left.insert(i);
            }
        }
        return null;
    }






}
