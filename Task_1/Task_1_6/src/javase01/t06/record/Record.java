package javase01.t06.record;


/**
 * Class for storage a text record
 * @autor Ivan Kulagin
 * @version 1.0
 */
public class Record {


    private String name;
    private String note;

    /**
     * Constructor that initializes name of record
     * @param name - name of record
     */
   public Record(String name){
        this.name = name;
    }

    /**
     *  Constructor that initializes record with name and text
     * @param name - name of record
     * @param note- text, that record contains
     */
    public Record(String name, String note){
        this.name = name;
        this.note = note;
    }

    /**
     * changes note stored in record
     * @param note - new note
     */
   public void changeRecord(String note) {
        this.note = note;
    }
   public String getRecord(){
        return note;
    }
    public String getName() {
        return name;
    }
}
