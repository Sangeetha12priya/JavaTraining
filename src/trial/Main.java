package trial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String [] args){

    List<String> list = new ArrayList<String>();
    list.add("First");
    list.add("Second");
    list.add("Third");

    ReversedIterator<String> reversedList = 
         new ReversedIterator<String>(list);

    // for-each syntax
    for(String s : reversedList){
      System.out.println(s);
    }

    System.out.println("");

    // iterator syntax
    Iterator<String> iterator = reversedList.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

  }
}