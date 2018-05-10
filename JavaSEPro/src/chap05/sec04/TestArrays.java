package chap05.sec04;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		int arr[] = {9, 2, 3, 8, 4};
//		System.out.println(arr);
		
		System.out.println("字符串形式输出："+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("排序后输出字符串："+Arrays.toString(arr));
		
		// 必须是排好序的数组
		System.out.println("2所在的位置索引："+Arrays.binarySearch(arr, 2));
		
		// 将指定内容填充到数组中，相当于重置
		Arrays.fill(arr, 100);
		System.out.println("填充后输出字符串："+Arrays.toString(arr));
	}
}
