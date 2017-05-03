package study.core.datastruct;

/**
 * Created by zhenweiyu on 2017/5/3.
 * 二叉搜索树
 */
public class BinaryTree<K extends Comparable,V> {

    private Node<K,V> root;

    public V getValue(K k){
        return getValue(root,k);
    }

    public BinaryTree(Node<K,V> node){
        this.root = node;
    }


    public V getValue(Node<K,V> node,K key){
        if(node==null){
            return null;
        }
        int compare = key.compareTo(node.key);
        if(compare == 0){
            return node.getValue();
        }else if(compare>0){
            return getValue(node.getRight(),key);
        }else if(compare<0){
            return getValue(node.getLeft(),key);
        }
        return null;
    }

    public void put(K key,V value){
        put(root,key,value);
    }

    public Node<K,V> put(Node<K,V> node,K key,V value){
         if(node == null){
             return new Node<K, V>(key,value);
         }
         int compare = key.compareTo(node.getKey());
         if(compare == 0){
             node.setValue(value);
         }else if(compare>0){
             node.setRight(put(node.getRight(),key,value));
         }else if(compare<0){
             node.setLeft(put(node.getLeft(),key,value));
         }
         return node;
    }

    public static void main(String []args){
        Node<Integer,String> rootNode = new Node<>(10,"10");
        BinaryTree<Integer,String> binaryTree = new BinaryTree<>(rootNode);
        binaryTree.put(12,"12");
        binaryTree.put(5,"5");
        binaryTree.put(36,"36");
        binaryTree.put(39,"39");
        binaryTree.put(2,"2");
        System.out.println("---------前序遍历----------");
        binaryTree.DLR(rootNode);
        System.out.println("---------后序遍历----------");
        binaryTree.LRD(rootNode);
        System.out.println("---------中序遍历----------");
        binaryTree.LDR(rootNode);
        System.out.println("---------搜索----------");
        System.out.println(binaryTree.getValue(44)!=null?binaryTree.getValue(5):"不存在");
    }

    //前序遍历
    public void DLR(Node root){
         System.out.println(root.toString());
         if(root.getLeft()!=null){
            DLR(root.getLeft());
         }
         if(root.getRight()!=null){
             DLR(root.getRight());
         }
    }

    //后序遍历
    public void LRD(Node root){
        if(root.getLeft()!=null){
            LRD(root.getLeft());
        }
        if(root.getRight()!=null){
            LRD(root.getRight());
        }
        System.out.println(root.toString());
    }

    //中序遍历
    public void LDR(Node root){
        if(root.getLeft()!=null){
            LDR(root.getLeft());
        }
        System.out.println(root.toString());
        if(root.getRight()!=null){
            LDR(root.getRight());
        }
    }



    static class Node<K,V>{

        private Node<K,V> left;

        private Node<K,V> right;

        private K key;

        private V value;

        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }

        public Node<K,V> getLeft(){
            return left;
        }

        public Node<K,V> getRight(){
            return right;
        }

        public void setLeft(Node<K,V> left){
            this.left = left;
        }

        public void setRight(Node<K,V> right){
            this.right = right;
        }

        public K getKey(){
            return key;
        }

        public V getValue(){
            return value;
        }

        public void setKey(K k){
            this.key = k;
        }

        public void setValue(V v){
            this.value = v;
        }

        @Override
        public String toString() {
            return String.format("key:%s value:%s",String.valueOf(key),String.valueOf(value));
        }
    }
}
