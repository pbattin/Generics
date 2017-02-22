/**
 * Created by prestonbattin on 2/22/17.
 */
public class MySet<T> {

    private  T[] set;


    MySet(){

        set = (T[]) new Object[0];
    }

    public boolean add(T t){

        if(!contains(t)){

            T[] temp = (T[]) new Object[size()+1];
            for(int i = 0; i < size(); i++){

                temp[i] = set[i];
            }

            temp[size()] = t;
            set = temp;
            return true;
        }
        return false;
    }

    public boolean contains(Object o){

        for(T temp: set){

            if(temp.equals(o))
                return true;
        }
        return false;
    }

    public int size(){

        return set.length;
    }

    public void clear(){

        set =  (T[]) new Object[0];
    }

    public <T> T[] toArray(){


        return (T[]) set;


    }


}
