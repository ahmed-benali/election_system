/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election_system;

/**
 *
 * @author ahmed
 */
public class user {
    int id;
    String f_name;
    String l_name;
    
    
    public user(int id,String f_name,String l_name){
        this.id=id;
        this.f_name=f_name;
        this.l_name=l_name;
        
    }
    
    
    public int getid(){
        return id;
    }
    
    public String getfname(){
        return f_name;
    }
    
    public String getlname(){
        return l_name;
    }
    
    @Override
    public String toString(){
        return "id="+id+", first name="+f_name+", last name="+l_name+"\n";
    }
    

    
}
