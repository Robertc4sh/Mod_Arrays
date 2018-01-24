
/**
 * Write a description of class ModArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModArrays
{
    int[] array = {1, 2, 3, 4, 5, 6};
    public ModArrays(){
        //We just need a blank constructer to access array.
    }
    public void changeNum(int num, int index){
        /**If I call this method, it should change the array.
         * 
         * @param num The new number to be added
         * @param index Where the new number is to be placed.
         * 
         */
        array[index] = num;
    }
    public void remove(int index){
        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        
    }
    
    public void addNum(int num, int index){
        for (int i =  array.length - 1; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = num;
    }
    
}