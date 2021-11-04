package bsu.comp152;

import java.util.ArrayList;

public class BSUFacultyBook extends RecordBook{

    public BSUFacultyBook(String Label) {
        super(Label);
    }

    @Override
    public Contact findContact(String name) {
        return null;
    }
    public void loadData(){
    var fileName = "Contacts.txt";
        ArrayList data = new ArrayList<Contact>();

    }




}
