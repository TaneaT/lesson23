import java.util.*;

public class Media<E>  implements WorkMedia<E>{

    List<E> list = new ArrayList<>();
    public void addBook(E value){
        list.add(value);
    }

    public E getBook(int index){
        return list.get(index);
    }


    public void addVideo(E video){
        list.add(video);
    }

    public void getAllVideo(){
        for(E index1 : list){
            System.out.println(index1);
        }
    }

    @Override
    public void works() {
        System.out.println("This media works");
    }
}
