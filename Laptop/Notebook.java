import java.util.*;

public class Notebook {

    int memory;
    int hdd;
    String os;
    String colour;

    /**
     * Заполнение справочника оперативной памяти
     * @param memories
     * @return Map
     */
    static Map <Integer, Integer> fillMemories (Map <Integer, Integer> memories) {
        memories.put(1, 8);
        memories.put(2, 16);
        memories.put(3, 32);
        return memories;
    }

    /**
     * Заполнение справочника жестких дисков
     * @param hdds
     * @return
     */
    static Map <Integer, Integer> fillHdds (Map <Integer, Integer> hdds) {
        hdds.put(1, 512);
        hdds.put(2, 1024);
        return hdds;
    }

    /**
     * Заполнение справочника операционных систем
     * @param oss
     * @return
     */
    static Map <Integer, String> fillOss (Map <Integer, String> oss) {
        oss.put(1, "Windows 11");
        oss.put(2, "FreeDos");
        oss.put(3, "no OS");
        return oss;
    }

    /**
     * Заполнение справочника цветов
     * @param colours
     * @return
     */
    static Map <Integer, String> fillColours (Map <Integer, String> colours) {
        colours.put(1, "black");
        colours.put(2, "silver");
        colours.put(3, "white");
        return colours;
    }

    /**
     * Генерация ноутбука со случайными характеристиками
     * @param memories
     * @param hdds
     * @param oss
     * @param colours
     * @return Notebook
     */
    static Notebook generateNotebook (Map <Integer, Integer> memories, Map <Integer, Integer> hdds, Map <Integer, String> oss, Map <Integer, String> colours) {
        Notebook q = new Notebook();
        Random random = new Random();
        int index = random.nextInt(1, 4);
        q.memory = memories.get(index);
        index = random.nextInt(1, 3);
        q.hdd = hdds.get(index);
        index = random.nextInt(1, 4);
        q.os = oss.get(index);
        index = random.nextInt(1, 4);
        q.colour = colours.get(index);
        return q;
    }

    @Override
    public String toString() {
        return ("Memory: " + memory + "Gb, " + "HDD: " + hdd + "Gb, " + "Операционная система: " + os + ", Цвет: " + colour);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Notebook)){
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return memory == notebook.memory && hdd == notebook.hdd && os.equals(notebook.os) && colour.equals(notebook.colour);
    }

    @Override
    public int hashCode() {
        return 3 * memory + 7 * hdd + 13 * os.hashCode() + 24 * colour.hashCode();
    }
}