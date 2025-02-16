package exceptionhandling.multiplecatchblocks;

public class ArrayOperation {
    public static void arrayOperation(int[] array, int index){
        try {
            if(array == null){
                throw new NullPointerException("Null pointer exception: ");
            }
            System.out.println("Value at Index "+index+" : "+array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid  Index "+e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Arrays is not initialized "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5};
        int[] array1 = null;
        arrayOperation(array, 2);
        arrayOperation(array, 7);
        arrayOperation(array1,2);
    }
}
