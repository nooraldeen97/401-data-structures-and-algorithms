/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
      HashTable hashTable =new HashTable();
      hashTable.add("ab",5);
      hashTable.add("cd",7);

//      System.out.println(hashTable.array[hashTable.hash("a")].value);
//      System.out.println(hashTable.array[hashTable.hash("a")].next.value);

      System.out.println(hashTable.get("cd"));
//
//      System.out.println(hashTable.contains("b"));
//      System.out.println(hashTable.hash("ab"));
    }
}