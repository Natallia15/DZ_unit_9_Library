public class Reader {
    String fio;
    int numberBileta;
    String faculty;
    String dateBirth;
    int phoneNumber;
    int kolBooks;
    String books;
    Reader (String fio, int numberBileta, String faculty, String dateBirth, int phoneNumber){
        this.fio = fio;
        this.numberBileta = numberBileta;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  books ;
    }

    void takeBook(String fio, int kolBooks){
        System.out.println( fio + " взял "+ kolBooks +" книги");
    }
    void takeBook1(String fio, String ... books){
        System.out.print(fio + " взял книги: ") ;

        for (String o : books){
        System.out.print( o.toString()+ " ;");}
        System.out.println();
    }

    void takeBook2(String fio, Book ... book){
                System.out.print(fio + " взял книги: ") ;
        for (Book o : book){
            System.out.print(  o.toString() + " ;");
        }

    }

    void returnBook (){}
}
