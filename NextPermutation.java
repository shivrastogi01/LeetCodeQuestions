class NextPermutation{
public void nextPermutation(int[] arr) {
    int n = arr.length;
    
    if(n==1)
        return;
    
    int i = n-2;
    while(i >= 0){   // getting the first decreasing value from right
        if(arr[i+1] > arr[i])      
            break; 
       i--; 
    }
    
    if(i==-1){   // It means Array is in Decsending Order we will just Reverse it
        reverse(arr, 0 , n-1);
        return;
    }
    else{     
        int j;
        for(j=n-1; j>i; j--){ //just bigger value than our last value at index i
            if(arr[j]>arr[i])
                break;
        }
        swap(arr, i, j);  // swapping values at both indexes.

        reverse(arr, i+1, n-1);  // reversing array after swapping value
    }
}

public void swap(int[] arr, int a, int b){   // swap method using XOR
    arr[a] = (arr[a] ^ arr[b]);
    arr[b] = (arr[a] ^ arr[b]);
    arr[a] = (arr[a] ^ arr[b]);
}

public void reverse(int[] arr, int l, int r){
    while(l<r){
        swap(arr, l++, r--);
    }
}
}