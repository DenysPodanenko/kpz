import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list = new ArrayList<>();

    public void appendElem(T elem)
    {
        if(list.size() == 0)
        {
            list.add(elem);
            return;
        }

        boolean isAdded = false;
        for(int i=0;i<list.size();i++) {
            if (elem.compareTo(list.get(i)) < 0) {
                list.add(i, elem);
                isAdded = true;
                break;
            }
        }

        if(!isAdded)
        {
            list.add(elem);
        }
    }

    public void coutList()
    {
        for(T elem : list)
        {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
