# 📌 Maze Mind 🚀  
*A Java-based Maze Solver using the Breadth-First Search (BFS) algorithm to find the shortest path in a maze.*

---

## 📖 Overview  
This project implements a **Maze Solver** using the **Breadth-First Search (BFS)** algorithm. The program finds the shortest path from the start position to the goal position in a given maze. It visualizes the process of exploring the maze and prints the path when the goal is reached.  

💡 Ideal for students, developers, and enthusiasts who want to **understand BFS algorithm** and its application in maze-solving.

---

## 📌 Features  
✅ **Breadth-First Search (BFS) Algorithm** – Finds the shortest path in the maze.  
✅ **Path Visualization** – Prints the path from the start to the goal.  
✅ **Maze Representation** – Walls are represented by `1`, and open spaces by `0`.  
✅ **Interactive Process** – Shows step-by-step movement from the start to the goal.  
✅ **Simple Maze Setup** – 2D maze with customizable start and goal positions.  

---

## 🚀 Installation & Usage  

### 📥 Prerequisites  
Ensure you have **Java** installed on your system.  
Check by running:  
```sh
java -version
```

### **🔧 Steps to Run**  
1️⃣ **Clone the Repository**  
```sh
git clone [https://github.com/AnweshaMondal/Maze-Mind.git]
cd Maze-Mind
```
  
2️⃣ **Compile the Java file**  
```sh
javac Maze.java
```

3️⃣ **Run the Programs**   
```sh
java Maze
```

4️⃣ **Maze Configuration**
The program uses a predefined maze with the following layout:

```sh
0 1 1 0 1
0 0 1 1 0
1 0 0 0 1
1 1 1 0 0
0 0 0 1 0
```
The starting point is at (0,0) and the goal is at (4,4). You can modify the maze and starting/goal positions as needed in the main function.

### 📊 Sample Output
Maze and Path Example

sh
```
[0, 0]
   |
[1, 0]
   |
[2, 0]
   |
[3, 0]
   |
[3, 1]
   |
[4, 1]
   |
[4, 2]
   |
[4, 3]
   |
[4, 4]
```
