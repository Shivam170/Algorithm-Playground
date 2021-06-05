package com.company.leetcode;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeTwoList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode output = null;
        ListNode head = null;

        while(temp1!=null && temp2!=null){
            if(temp1.val <= temp2.val){
                ListNode node = new ListNode(temp1.val);
                if(output==null){
                    output=node;
                    head = output;
                }else{
                    output.next = node;
                    output=output.next;
                }
                temp1 = temp1.next;
            }else{
                ListNode node = new ListNode(temp2.val);
                if(output==null){
                    output=node;
                    head = output;
                }else{
                    output.next = node;
                    output=output.next;
                }
                temp2 = temp2.next;
            }
        }
        while(temp1!=null){
            ListNode node = new ListNode(temp1.val);
            if(output==null){
                output=node;
                head = output;
            }else{
                output.next = node;
                output=output.next;
            }
            temp1=temp1.next;
        }
        while(temp2!=null){
            ListNode node = new ListNode(temp2.val);
            if(output==null){
                output=node;
                head = output;
            }else{
                output.next = node;
                output=output.next;
            }

            temp2=temp2.next;
        }
        return head;
    }

    public static ListNode mergeTwoList(ListNode temp1, ListNode temp2){
        ListNode output = null;
        ListNode head = null;

        while(temp1!=null && temp2!=null){
            if(temp1.val <= temp2.val){
                ListNode node = new ListNode(temp1.val);
                if(output==null){
                    output=node;
                    head = output;
                }else{
                    output.next = node;
                    output=output.next;
                }
                temp1 = temp1.next;
            }else{
                ListNode node = new ListNode(temp2.val);
                if(output==null){
                    output=node;
                    head = output;
                }else{
                    output.next = node;
                    output=output.next;
                }
                temp2 = temp2.next;
            }
        }

        while(temp1!=null){
            ListNode node = new ListNode(temp1.val);
            if(output==null){
                output=node;
                head = output;
            }else{
                output.next = node;
                output=output.next;
            }
            temp1=temp1.next;
        }
        while(temp2!=null){
            ListNode node = new ListNode(temp2.val);
            if(output==null){
                output=node;
                head = output;
            }else{
                output.next = node;
                output=output.next;
            }
            temp2=temp2.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode l3 = mergeTwoList(l1,l2);
        System.out.println(l3);
    }
}
