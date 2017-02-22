/**
 * Created by prestonbattin on 2/22/17.
 */
public class MyArrayList<T> {

    private T[] list;

    MyArrayList(){

        list = (T[]) new Object[0];
    }

    MyArrayList(int size){

        list = (T[]) new Object[size];
    }

    public boolean  add(final T a){

        T[] temp = (T[]) new Object[size()+1];
        for(int i = 0; i < size(); i++){

            temp[i] = list[i];
        }

        temp[size()] = a;
        list = temp;
        return true;
    }

    public boolean add(int index, T t){

        T[] temp = (T[]) new Object[size()+1];

        temp[index] = t;

        for(int i = 0; i < size(); i++){

            if(i == index)
                i++;

            temp[i] = list[i];
        }

        list = temp;
        return true;
    }

    public T get(final int index){

        return list[index];

    }

    public int size(){

        return list.length;
    }

    public T[] remove(final int index){

        T[] temp = (T[]) new Object[size()-1];
        for(int i = 0, j = 0; i < size(); i++){

            if(i == index){

                i++;
            }

            if(i != index) {
                temp[j] = list[i];
                j++;
            }
        }

        list = temp;
        return list;
    }

    public T[] set(int index, T t){

        list[index] = t;
        return list;
    }

    public void clear(){

        list =  (T[]) new Object[0];
    }

    public boolean isEmpty(){

        return size() == 0;
    }

    public boolean contains(Object o){

        for(T temp: list){

            if(temp.equals(o))
                return true;
        }
        return false;
    }
}
