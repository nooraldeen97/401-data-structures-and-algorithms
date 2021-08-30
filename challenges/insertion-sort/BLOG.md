# Insertion Sort
the idea behind Insertion Sort is that it loops through the array and compare each value with all the predecessors' values and if the value directly before is less than the current value nothing will happen, but if the value was larger than the current value replace them and compare the same value with the second predecessor and so on.

## Pseudocode
```
  InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```

## Working code 

```
   public static int[] insertionSort(int[] arr){

      for (int i = 1; i < arr.length; i++) {
        int j=i-1;
        int temp = arr[i];
        while (j>=0 && temp<arr[j]){
          arr[j+1]=arr[j];
          j=j-1;
        }
        arr[j+1]=temp;
      }
      return arr;
    }

 ```
## Trace
Sample Array: [8,4,23,42,16,15]

### Pass 1:
![img.png](pass1.png)

### Pass 2:
![img.png](pass2.png)

### Pass 3:
![img.png](pass3.png)

### Pass 4:
![img.png](pass4.png)

### Pass 5:
![img.png](pass5.png)



## Efficiency
1. Time: O(n^2)
   Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
2. Space: O(1)
No additional space is being created. This array is being sorted in place…keeping the space at constant O(1).