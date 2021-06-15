//package AlgoPlayground.misc.tree.BinaryTree;
//
//import java.util.*;
//
//public class VerticalOrderTraversal {
//        class Tuple{
//            TreeNode node;
//            int hd;
//            int vd;
//            Tuple(TreeNode node, int hd,int vd){
//                this.node = node;
//                this.hd = hd;
//                this.vd = vd;
//            }
//        }
//
//        public  List<List<Integer>> verticalOrderTraversal(TreeNode root){
//            if (root == null)
//                return new LinkedList<>();
//            TreeMap<Integer,LinkedList<Tuple>> map = new TreeMap<>();
//            Queue<Tuple> q = new LinkedList<>();
//            Tuple tuple = new Tuple(root,0,0);
//            q.add(tuple);
//            while (!q.isEmpty()) {
//                tuple = q.poll();
//                LinkedList<Tuple> list;
//                if(map.get(tuple.hd)==null){
//                    list = new LinkedList<>();
//                }else{
//                    list = map.get(tuple.hd);
//                    Tuple LastTup = list.getLast();
//                    if(LastTup.hd==tuple.hd && LastTup.vd==tuple.vd){
//                        if(LastTup.node.val>tuple.node.val){
//                            int temp = LastTup.node.val;
//                            LastTup.node.val = tuple.node.val;
//                            tuple.node.val = temp;
//                        }
//                    }
//                }
//                list.add(tuple);
//                map.put(tuple.hd,list);
//                if(tuple.node.left!=null) q.add(new Tuple(tuple.node.left,tuple.hd-1,tuple.vd+1));
//                if(tuple.node.right!=null) q.add(new Tuple(tuple.node.right,tuple.hd+1,tuple.vd+1));
//            }
//            List<List<Integer>> l = new ArrayList<>();
//            map.forEach((k,v)->{
//                ArrayList<Integer> l1 = new ArrayList<>();
//                for (Tuple item:v) {
//                    l1.add(item.node.val);
//                }
//                l.add(l1);
//            } );
//            return l;
//        }
//    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        TreeNode head = null;
//        head = bt.insert(head,10);
//        head = bt.insert(head,15);
//        head = bt.insert(head,5);
//        head = bt.insert(head,7);
//        head = bt.insert(head,19);
//        head = bt.insert(head,20);
//        head = bt.insert(head,4);
//        head = bt.insert(head,3);
//        VerticalOrderTraversal v = new VerticalOrderTraversal();
//        System.out.println(v.verticalOrderTraversal(head));
//    }
//}
