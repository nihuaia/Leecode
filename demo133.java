import java.util.*;

public class demo133 {
    public Node cloneGraph(Node node) {
        Set<Node> set = new HashSet<>();
        List<Node> list = new ArrayList<>();
        List<Node> tmplist = null;
        Node res = null;
        list.add(node);
        Node tmp;
        while(list.size()>0){
            tmp = list.remove(0);
            tmplist = new ArrayList<>();
            for(int i = 0;i<tmp.neighbors.size();i++){
                tmplist.add(tmp.neighbors.get(i));
            }
            res = new Node(tmp.val, (ArrayList<Node>) tmplist);
        }
        return res;

    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

