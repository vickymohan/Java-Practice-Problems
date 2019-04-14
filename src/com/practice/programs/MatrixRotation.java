package com.practice.programs;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] matrix = {
				   {1,  2,  3,  4},
				   {5,  6,  7,  8},
				   {9,  10, 11, 12},
				   {13, 14, 15, 16}
				  };
		  rotateMatrixInPlace(matrix,matrix.length-1);
		  printArray(matrix);
	}
	private static void printArray(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static void rotateMatrixInPlace(int[][] matrix, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<=length/2;i++){
			for(int j=i;j<length-i;j++){
				int p1=matrix[i][j];
				int p2=matrix[j][length-i];
				int p3=matrix[length-i][length-j];
				int p4=matrix[length-j][i];
				
				matrix[j][length-i]=p1;
				matrix[length-i][length-j]=p2;
				matrix[length-j][i]=p3;
				matrix[i][j]=p4;
				
			}
		}
	}

}
