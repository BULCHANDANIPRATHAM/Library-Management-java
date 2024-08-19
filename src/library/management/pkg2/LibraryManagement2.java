/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.management.pkg2;

/**
 *
 * @author pratham bulchanadni
 */
public class LibraryManagement2 {
     String lstName;
     String fstName;
     String bkName;
     String srcBkName;
     String rtBook;
     int bookId;
     int addCount;
     int rtCount;
     int searchCount;
    class node{
        String firstName;
        String lastName;
        String bookName;
        String returnBook;
        int bookId;
        node next1,next2,next3;
        node(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            this.next1 = null;
            }
        node(String bookName){
            this.bookName = bookName;
            this.next2 = null;
        }
        node(String returnBook,int bookId){
            this.returnBook = returnBook;
            this.bookId = bookId;
        }
    }
    
    public  void addPerson(String firstName,String lastName){
        node head = null;
        node newNode = new node(firstName,lastName);
        if(head == null){
            head = newNode;
        }
        newNode.next1 = head;
        head = newNode;
       }
    
    public void addBook(String bookName){
         LibraryManagement2 l = new  LibraryManagement2();
         l.addCount = 0;
        node head = null;
        node newNode = new node(bookName);
        if(head == null){
            head = newNode;
            ++l.addCount;
        }
        newNode.next2 = head;
        head = newNode;
    }
    
    public void rtBookAdd(String returnBook,int bookId){
         LibraryManagement2 l = new  LibraryManagement2();
         l.rtCount = 0;
        node head = null;
        node newNode = new node(returnBook,bookId);
        if(head == null){
            head = newNode;
            ++l.rtCount;
        }
        newNode.next3 = head;
        head = newNode;
        
    }
    
    public void search(String bookName){
         LibraryManagement2 l = new  LibraryManagement2();
         l.searchCount = 0;
       String[] nameOfTheIssuedBook = new String[100];
       for (int i =0;i<100;i++){
           nameOfTheIssuedBook[i]= bookName;
           l.searchCount = i;
       }
    }
    public static void main(String[] args) {
       
       
        
    }
    
    
    
   
}
   
