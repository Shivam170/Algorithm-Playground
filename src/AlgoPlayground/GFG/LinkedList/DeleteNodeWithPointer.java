package AlgoPlayground.GFG.LinkedList;

public class DeleteNodeWithPointer {
    void deleteNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
