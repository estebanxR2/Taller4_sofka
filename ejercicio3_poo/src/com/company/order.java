package com.company;
/**
 * @Autor Jair Esteban - jairesrival2@gmail.com
 */
public class order {
/**
 public void orderquicksort(int[] array) {
 array = quicksort1(array);
 }

 public int[] quicksort1(int numbers[]) {
 return quicksort2(numbers, 0, numbers.length - 1);
 }
 public int[] quicksort2(int numbers[], int left, int right) {
 if (left >= right)
 return numbers;
 int i = left, r = right;
 if (left != right) {
 int pivot;
 int aux;
 pivot = left;
 while (left != right) {
 while (numbers[right] >= numbers[pivot] && left < right)
 right--;
 while (numbers[left] < numbers[pivot] && left < right)
 left++;
 if (right != left) {
 aux = numbers[right];
 numbers[right] = numbers[left];
 numbers[left] = aux;
 }
 }
 if(left==right){
 quicksort2(numbers,i,left-1);
 quicksort2(numbers,left+1,r);
 }
 }
 else
 return numbers;
 return numbers;
 }*/
}