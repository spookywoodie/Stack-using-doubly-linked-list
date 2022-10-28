/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listproject;

/**
 *
 * @author Metch
 */
public class Node {
    private String ID;
    private String Name;
    private Node next;
    private Node prev;
    
    Node(){
        ID="";
        Name="";
        prev=null;
        next=null;
    }
    
    Node (String strID, String strName, Node n, Node p){
        ID=strID;
        Name=strName;
        next = n;
        prev = p;
    }
    Node (String strID, String strName){
        ID=strID;
        Name=strName;
        next = null;
        prev = null;
    }
    
    public void setData(String ID, String Name){
        this.ID = ID;
        this.Name = Name;
    }
    
    public void changeName(String strName){
        Name=strName;
    }
    
    public String toString(){
        return "ID: "+ID+"\tName: "+Name+"\n";
    }
    
    public void setNext(Node n){
        next=n;
    }
    
    public void setPrevious(Node p){
        prev=p;
    }
    
    public Node getNext(){
        return next;
    }
    
    public Node getPrevious(){
        return prev;
    }
}
