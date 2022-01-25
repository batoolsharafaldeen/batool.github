/**
 * Created by Lenovo on 1/23/2022.
 */
public interface Stack <E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}
