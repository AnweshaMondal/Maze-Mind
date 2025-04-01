import java.util.*;

class Node{

    int x;
    int y;
    List<int[]> path;
    
    public Node(int x, int y,List<int[]> path)
    {
        this.x = x;
        this.y = y;
        this.path = new ArrayList<>(path); // Ensure a new copy is stored

//   this.path = path; // Direct assignment
// This assigns the reference instead of making a new copy.
// Any change in this.path affects all previous nodes that used the same reference!
    }
}

public class Maze{

    List<int[]> bfs(int board[][], int start[], int goal[]){
            
        int row = board.length;
        int col = board[0].length;

        Queue<Node> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();
        List<int[]> initPath = new ArrayList<>();
        
        int[][]dirs = {{-1,0},{1,0},{0,-1},{0,1}};
       
        initPath.add(start);//add start position to the initial path
        q.add(new Node(start[0],start[1],initPath));//queue initialization, add start position, empty list
        vis.add(start[0]+","+start[1]);//mark the atart node as visited


        while(!q.isEmpty())
        {
            Node curr = q.poll();
            int xpos = curr.x;
            int ypos = curr.y;
            //Reached goal
            if(xpos==goal[0] && ypos==goal[1])
            {
                return curr.path;
            }
            // curr.path.add(new int[]{xpos,ypos});

            //generate all neighbors
            for(int dir[] : dirs)
            {
                int newx = xpos + dir[0];
                int newy = ypos + dir[1];

                if(newx>=0 && newx<row && newy>=0 && newy<col && board[newx][newy] == 0 &&!vis.contains(newx+","+newy))
                {
                    vis.add(newx+","+newy);
                    //create a new arrayList for each neighbor in each iteration, to store the correct path
                    List<int[]> pathTillNow = new ArrayList<>(curr.path);
                    pathTillNow.add(new int[]{newx, newy});
                    q.add(new Node(newx, newy, pathTillNow)); // Fix: Add the new node to the queue
                }
            }

        }

       return null;        
    }

    void printPath(List<int[]> path)
    {
        for(int i= 0; i<path.size(); i++)
        {
            int[] pos = path.get(i);
            System.out.println(Arrays.toString(pos));
            System.out.println("   |");
        }
        System.out.println("End!");
    } 

//Main function
    public static void main(String[] args) {
        
        int board[][]={{0,1,1,0,1},
                       {0,0,1,1,0},
                       {1,0,0,0,1},
                       {1,1,1,0,0},
                       {0,0,0,1,0}};
        
        int start[] = {0,0};
        int goal[] = {4,4};
        Maze obj = new Maze();
        List<int[]> path = obj.bfs(board, start, goal);
        
        if (path == null || path.isEmpty()){
            System.out.println("No path to reach Goal!");
            return;
        }
    
        obj.printPath(path);
    }
}
