import java.util.Collection;
import java.util.Iterator;

/**
 * Created by prestonbattin on 2/22/17.
 */
public class MySet<T> {

    private  T[] set;
    static private int currentIndex = 0;


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

    public boolean addAll(Collection<T> c) {

        int expandArrayBy = 0;
        for(T t: c){

            if (!contains(t))
                expandArrayBy++;
        }

        T[] temp = (T[]) new Object[size() + expandArrayBy];


        int count = 0;
        for (int i = 0; i < size(); i++) {

            temp[i] = set[i];
            count++;
        }


        for (T t : c) {

            if (!contains(t)) {
                temp[count] = t;
                count++;

            }
        }
        set = temp;
        return true;
    }

    public boolean contains(Object o){

        for(T temp: set){

            if(temp.equals(o))
                return true;
        }
        return false;
    }

    public boolean containsAll(Collection<T> c){
        boolean containsAll = true;

        for(T t: c){

            if(!contains(t))
                return false;
        }
        return true;

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


    public boolean equals(Collection<T> c){

        if(containsAll(c) && size() == c.size())
            return true;

        else
            return false;
    }

    public int hashCode(){

        return set.hashCode();
    }

    public boolean isEmpty(){

        return size() == 0;
    }

    public Iterator<T> 	iterator(){

      Iterator<T> iterator = new Iterator<T>() {



          public boolean hasNext() {

              return currentIndex < size() && set[currentIndex] != null;
          }

          public T next() {

              return set[currentIndex++];
          }

          public void remove(){

              throw new UnsupportedOperationException();
          }
      };

      return iterator;
    }

    public boolean remove(final int index){

        T[] temp = (T[]) new Object[size()-1];
        for(int i = 0, j = 0; i < size(); i++){

            if(i == index){

                i++;
            }

            else if(i != index) {
                temp[j] = set[i];
                j++;
            }
        }

        set = temp;
        return true;
    }

    public boolean removeAll(Collection<T> c){


        for(T t: c){

            for(int i = 0; i < size(); i++){
                if(set[i] == t) {

                    remove(i);
                }
            }
        }

        return true;
    }

}
