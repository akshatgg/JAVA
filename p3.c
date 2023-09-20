#include <stdio.h>
#include <stdlib.h>

void bubbleSort(int arr[], int n) {
    int temp;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    int n, m;
    scanf("%d", &n);
    scanf("%d", &m);

    int arr1[n];
    int arr2[m];
    
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
    }
    for (int i = 0; i < m; i++) {
        scanf("%d", &arr2[i]);
    }

    int c = n + m;
    int arr3[c];

    int j = 0;
    for (int i = 0; i < n; i++) {
        arr3[j] = arr1[i];
        j++;
    }

    for (int i = 0; i < m; i++) {
        arr3[j] = arr2[i];
       
        j++;
    }
    for (int i = 0; i < c; i++) {
        
        printf("%d ", arr3[i]);
    }

    //bubbleSort(arr3, c);


    return 0;
}
