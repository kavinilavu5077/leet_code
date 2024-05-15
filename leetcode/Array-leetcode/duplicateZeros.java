public class duplicateZeros {
        public void duplicateZeros(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) { 
                if (arr[i] == 0) {
                    for (int j = n - 2; j >= i; j--) {
                        arr[j + 1] = arr[j]; 
                    }
                    i++; 
                }
            }
        }
        
        public static void main(String[] args) {
            duplicateZeros solution = new duplicateZeros();
            int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
            System.out.println("Original array: ");
            printArray(arr);
            
            solution.duplicateZeros(arr);
            
            System.out.println("Array after duplicating zeros: ");
            printArray(arr);
        }
        
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
