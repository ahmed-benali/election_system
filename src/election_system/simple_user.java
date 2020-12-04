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
public class simple_user extends user{
        String region;
        int code;
        boolean vote;
    
    public simple_user(int id,String f_name,String l_name,String region,boolean vote,int code){
        super(id,f_name,l_name);
        this.region=region;
        this.code=code;
        this.vote=vote;
    }

        public String getregion(){
        return region;
    }
            public int getcode(){
        return code;}
        
        public boolean getvote(){
            return vote;
        }
        
            public String toString(){
        return "Simple user: id="+id+", first name="+f_name+", last name="+l_name+", region="+region+"\n";
    }
    
    
}
