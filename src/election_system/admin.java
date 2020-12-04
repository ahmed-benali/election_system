/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election_system;

import election_system.user;

/**
 *
 * @author ahmed
 */
public class admin extends user {
    
            String pass;
    
    public admin(int id,String f_name,String l_name,String pass){
        super(id,f_name,l_name);
        this.pass=pass;
    }

        public String getpass(){
        return pass;
    }
            public String toString(){
        return "Admin: id="+id+", first name="+f_name+", last name="+l_name+", pass="+pass+"\n";
    }
    
       
}
    

