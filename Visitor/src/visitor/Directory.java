package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;                    
    private ArrayList<Entry> dir = new ArrayList<Entry>();      
    public Directory(String name) {        
        this.name = name;
    }
    public String getName() {             
        return name;
    }
    public int getSize() {                  
        int size = 0;
        Iterator<Entry> it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {         // ��Ʈ���� �߰�
        dir.add(entry);
        return this;
    }
    public Iterator<Entry> iterator() {      // Iterator�� ����
        return dir.iterator();
    }
    public void accept(Visitor v) {         // �湮�ڸ� �޾Ƶ���
        v.visit(this);
    }
}
