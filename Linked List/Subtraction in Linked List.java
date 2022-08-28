class Solution
{
    static Node subLinkedList(Node l1, Node l2)
    {
        
        int count1 = 0;
        int count2 = 0;
        
        while(l1 != null && l1.data == 0){
            l1 = l1.next;
        }
        
        while(l2 != null && l2.data == 0){
            l2 = l2.next;
        }
        
        Node node1 = l1;
        Node node2 = l2;
        
        while(l1 != null){
            count1++;
            l1 = l1.next;
        }
        
        while(l2 != null){
            count2++;
            l2 = l2.next;
        }

        l1 = node1;
        l2 = node2;
        
        if(count1 < count2 || (count1 == count2 && node2 == getBigger(node1, node2))){
            Node temp = node1;
            node1 = node2;
            node2 = temp;
        }
        
        node1 = reverse(node1);
        node2 = reverse(node2);
        
        boolean borrow = false;
        
        Node diffNode = null;
        Node diffNodeHead = null;
        
        
        while(node1 != null){
            
            if(borrow){
                node1.data = node1.data -1;
                borrow = false;
            }
            
            if(node1.data < (node2 != null ? node2.data : 0)){
                borrow = true;
                node1.data = node1.data + 10;
            }
            
            int diff = node1.data - (node2 != null ? node2.data : 0);
            
            Node newNode = new Node(diff);
            
            if(diffNodeHead == null){
                diffNodeHead = newNode;
            }else{
                diffNode.next = newNode;
            }
            
            diffNode = newNode;
            
            node1 = node1.next;
            if(node2 != null){
                 node2 = node2.next;
            }
        }
        
        diffNodeHead = reverse(diffNodeHead);
        
        while(diffNodeHead.next != null && diffNodeHead.data == 0){
            diffNodeHead = diffNodeHead.next;
        }

        return diffNodeHead;
    }
    
    public static void printNodeList(Node node){
        Node temp = node;
        
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println("");
    }
    
    public static Node reverse(Node node){
        Node prev = null;
        Node head = node;
        
        while(node != null){
            Node nextNode = node.next;
            node.next = prev;
            prev = node;
            node = nextNode;
        }
        return prev;
    }
    
    public static Node getBigger(Node node1, Node node2){
        Node node1_ = node1;
        Node node2_ = node2;
        
        
        while(node1_ != null && node2_ != null){
            if(node1_.data < node2_.data){
                return node2;
            }else if(node1_.data > node2_.data){
                return node1;
            }
            node1_ = node1_.next;
            node2_ = node2_.next;
        }
        
        return node1;
        
    }
}
