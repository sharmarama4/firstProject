public class CheckDoubleOfArray {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 5, 4, 2, 6, 5, 4};
        for (int i = 0; i < numbers.length; i++) {
            boolean isDouble = false;
            for (int j = 1; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDouble = true;
                    break;
                }
            }

if(isDouble){
    System.out.print(numbers[i]+" ");
}
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            boolean isDouble = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDouble = true;
                    break;
                }
            }

            if(!isDouble){//print only unique
                System.out.print(numbers[i]+" ");
            }
        }

    }
}
