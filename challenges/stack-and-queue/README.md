# Stack and Queue<br>
## Stack<br>
A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does <br>not reference its previous.<br>


# Challenge
Create a Stack, and a Queue that have the top properties.<br>



# Approach & Efficiency<br>

All the methods in the Stack and Queue classes are of a big O(1) time complexity<br>

# API

Common terminology for a stack is:<br>

1- Push - Nodes or items that are put into the stack are pushed.<br>

2- Pop - Nodes or items that are removed from the stack are popped. When you attempt to pop an empty stack an<br> exception will be raised.<br>

3- Peek - When you peek you will view the value of the top Node in the stack. When you attempt to peek an empty<br> stack an exception will be raised.<br>

4- IsEmpty - returns true when stack is empty otherwise returns false.<br>

## Queue<br>
Common terminology for a queue is:<br>
1- Enqueue - Nodes or items that are added to the queue.<br>

2- Dequeue - Nodes or items that are removed from the queue. If called when the queue is empty an exception<br> will be raised.<br>

4- Peek - When you peek you will view the value of the front Node in the queue. If called when the queue is<br> empty an exception will be raised.<br>

5- IsEmpty - returns true when queue is empty otherwise returns false.<br>

<hr>

## Challenge Pseudo Queue<br>

Create a new class called pseudo queue. this PseudoQueue class will implement our standard queue interface. <br>Internally, utilize 2 Stack instances to create and manage the queue.<br>

pseudoEnqueue() : Inserts value into the PseudoQueue, using a first-in, first-out approach.<br>

pseudoDequeue() : Extracts a value from the PseudoQueue, using a first-in, first-out approach.<br>



## White borad <br>

![image](./psuedoQueue.png)

Approach & Efficiency<br>

pseudoEnqueue() : Inserts value into the PseudoQueue, using a first-in, first-out approach.<br>

Space: O(1)<br>

Time : O(1)<br>

pseudoDequeue() : Extracts a value from the PseudoQueue, using a first-in, first-out approach.<br>

Space: O(1)<br>

Time : O(n)<br>

<hr>

## Challenge Animal Shelter <br>

Create a class called AnimalShelter which holds only dogs and cats, using a first-in, first-out approach.<br>

enqueue() : animal can be either a dog or a cat object., using a first-in, first-out approach.<br>

dequeue() : Extracts a either a dog or a cat, based on preference, using a first-in, first-out approach. If <br>pref is not "dog" or "cat" then return null.<br>

Whiteboard Process<br>

![image](./animalshelter.png)

Approach & Efficiency <br>

enqueue() : <br>

Space: O(1) <br>

Time : O(1) <br>

dequeue() :<br>

Space: O(1) <br>

Time : O(1) <br>

