public class ArrayBoundedStack<T> implements StackInterface<T>

{
protected final int DEFCAP = 100;
protected T[] elements;
protected int topIndex = -1;

public ArrayBoundedStack()
{
elements = (T[]) new object[DEFCAP];

}
 
 public ArrayBoundedStack(int maxSize)
 {
 elements = (T[]) new object[maxSize];
 }
}