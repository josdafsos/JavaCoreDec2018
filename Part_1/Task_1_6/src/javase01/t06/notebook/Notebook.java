package javase01.t06.notebook;

import javase01.t06.record.Record;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Simple notebook for storage text notes
 * Each note must have a unique name
 *
 *
 * @author Ivan Kulagin
 * @version  1.0
 */
public class Notebook {

    private Map<String, Record> records;


    Notebook(){
        records = new HashMap<String, Record>();
    }


    /**
     * Adds a new record to the notebook
     * @param name name of record, must be unique
     * @param note text of record
     */
    public void addRecord(String name, String note){
        if(records.containsKey(name)){
            System.out.println("Notebook already contains note with this name.");
            return;
        }
        Record record = new Record(name, note );
        System.out.println("note has been added successfully");
        records.put(name,record);
    }

    /**
     * Checks whether record with this name already exists
     * @param name - name to check
     * @return true if name already exists
     */
    public boolean isNameExist(String name){
        return records.containsKey(name);
    }

    /**
     * Changes text of record
     * @param name name of record text of which will be changed
     * @param note new text for the record
     */
    public void changeRecord(String name, String note){
        if(!this.isNameExist(name)) {
            System.out.println("Can not find record with this name");
            return;
        }
        records.get(name).changeRecord(note);
        System.out.println("Record has been changed successfully");
    }

    /**
     * Delets record
     * @param name name of the record that will be deleted
     */
    public void deleteRecord(String name){
        if(records.remove(name) == null) {
            System.out.println("Record with this name does not exist");
            return;
        }
        System.out.println("Record has beed deleted successfully");
    }

    /**
     * List all records that notebook contains
     */
    public void watchAllRecords(){
        for (Record rec : records.values()) {
            System.out.println("Record: " + rec.getName());
            System.out.println(rec.getRecord());
        }
    }

    public static void main(String[] args) throws IOException {

        Notebook notebook = new Notebook();
        Scanner input = new Scanner(System.in);
        BufferedReader bufReader=new BufferedReader(new InputStreamReader(System.in));
        String name;
        String note;

        int userChoice;
        loop:
        do{
            System.out.println("What do you want to do?");
            System.out.println("0 - exit\n1 - add a record\n2 - change a record\n" +
                    "3 - delete a record\n4- list all records");
            userChoice = input.nextInt();
            switch(userChoice){
                case 0: break loop;
                case 1:
                    System.out.println("Enter a name of a new record");
                    name = bufReader.readLine(); // an issue occures when using scanner instead
                    if(notebook.isNameExist(name)) {
                        System.out.println("Notebook already contains note with this name.");
                        break;
                    }
                    System.out.println("Enter some text");
                    note = bufReader.readLine(); // an issue occures when using scanner instead
                    notebook.addRecord(name,note);
                    break;
                case 2:
                    System.out.println("Enter name of record you want to change");
                    name = bufReader.readLine();
                    if(!notebook.isNameExist(name)) {
                        System.out.println("Can not find record with this name");
                        break;
                    }
                    System.out.println("Enter new text for this record");
                    note = bufReader.readLine();
                    notebook.changeRecord(name,note);
                    break;
                case 3:
                    System.out.println("Enter the name of the record you want to delete");
                    name = bufReader.readLine();
                    notebook.deleteRecord(name);
                    break;
                case 4:
                    notebook.watchAllRecords();
                    break;
                default:
                    System.out.println("Unknown command");
                    continue;
            }

        }while(true);


    }
}
