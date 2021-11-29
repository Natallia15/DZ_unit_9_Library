public class Main {
    public static void main (String [] args){
Reader reader1 = new Reader("Иванова Юлия", 125, "ФПМ", "15 мая 1990", 2444444);
        Reader reader2 = new Reader("Петров Иван", 285, "ООП", "26 ноября 1991", 58852525);
        Reader reader3 = new Reader("Чистый Роман", 326, "ТТЛ", "25 января 1989", 254588);
        Reader reader4 = new Reader("Заморская Дарья", 76, "ФПМ", "6 июня 1990", 2358852);
        Reader [] array = {reader1, reader2, reader3, reader4};
        Book book1 = new Book("Д. Лондон", "Приключения");
        Book book2 = new Book("Даль", "Словарь");
        Book book3 = new Book("Эйнштейн", "Энциклопедия");
reader1.takeBook(reader1.fio, 3);
        reader1.takeBook1(reader1.fio, "Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook2(reader1.fio, book1, book3) ;
    }

}
