# Graphs
<!-- Short summary or background information -->
A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph. 

## Challenge
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

-add node
-add edge
-get nodes
-get neighbors
-size

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
add node<br>
Time: O(1)<br>
Space: O(1)<br>

add edge<br>
Time: O(1)<br>
Space: O(1)<br>

get nodes<br>
Time: O(1)<br>
Space: O(n): n is the number of nodes<br>

get neighbors<br>
Time: O(1)<br>
Space: O(1)<br>

size<br>
Time: O(n): n is the number of nodes<br>
Space: O(1)<br>

## API
<!-- Description of each method publicly available in your Graph -->
add node: only to add a new node into the graph without any connection to other nodes
add edge: to add a connection between two nodes with the required weight (the weight is optional)
get nodes: to get all the nodes in the graph as a list
get neighbors: to get all the connections of the required node as a list
size: to get the size (number) of all the nodes in the graph