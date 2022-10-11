import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 단체사진찍기 {
    class Solution {
        public int solution(int n, String[] data) {
            int answer = 0;

            return answer;
        }

    }
    class Graph{
        class Node{
            int data;
            LinkedList<Node> adjacent;
            boolean marked;
            Node(int data){
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<>();
            }
        }
        Node[] nodes;
        Graph(int size){
            nodes = new Node[size];
            for(int i=0; i < size; i++){
                nodes[i] = new Node(i);
            }
        }
        void addEdge(int i1, int i2){
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];
            if(!n1.adjacent.contains(n2)){
                n1.adjacent.add(n2);
            }
            if(!n2.adjacent.contains(n1)){
                n1.adjacent.add(n1);
            }
        }
        void dfs(){
            dfs(0);
        }
        void dfs(int index){
            Node root = nodes[index];
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            root.marked = true;
            while(!stack.isEmpty()){
                Node r = stack.pop();
                for(Node n: r.adjacent){
                    if(n.marked == false){
                        n.marked = true;
                        stack.push(n);
                    }
                }
                visit(r);
            }
        } // end of dfs

        void bfs(int index){
            Node root = nodes[index];
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            root.marked = true;
            while(!queue.isEmpty()){
                Node r = queue.poll();
                for(Node n : r.adjacent){
                    if(n.marked == false){
                        n.marked = true;
                        queue.add(n);
                    }
                }
                visit(r);
            }
        }

        void dfsR(Node r){
            if(r == null) return;
            r.marked = true;
            visit(r);
            for(Node n : r.adjacent){
                if(n.marked == false){
                    dfsR(n);
                }
            }
        }
        void dfsR(int index){
            Node r = nodes[index];
            dfsR(r);
        }

        void dfsR(){
            dfsR(0);
        }

        void visit(Node n){
            System.out.println(n.data + " ");
        }

    }

    public static void main(String[] args) {
//        Graph g = new Graph(9);
//        g.addEdge(0, 1);

    }
}
