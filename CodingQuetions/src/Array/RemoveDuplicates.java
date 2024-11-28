/*
 * package Array;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class RemoveDuplicates {
 * 
 * 
 * public static void removeDuplicates(int[] arr) { int n = arr.length;
 * 
 * HashMap<Integer, Integer> map = new HashMap<>();
 * 
 * 
 * 
 * for(int i=0; i<n; i++) { map.put(arr[i],map.getOrDefault(map.get(arr[i]),
 * 0)+1); }
 * 
 * for(Map.Entry<Integer,Integer> entry : m)) {
 * 
 * }
 * 
 * }
 * 
 * 
 * public static void main(String[] args) {
 * 
 * }
 * 
 * 
 * 
 * 2 6 12 20 30 ?
 * 
 * diff : 4 6 8 10 12
 * 
 * 30+12 = 42
 * 
 * }
 */