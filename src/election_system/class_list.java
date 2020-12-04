package election_system;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
public class class_list {
    ArrayList<user> list;
    
    class_list(){
        list=new ArrayList();
    }
    public void adduser(user u){
        list.add(u);
    }
    
    public int getsimpleusernum(){
        int k=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof simple_user){
                k++;
            }
        }
        return k;
    }
    
        public int getadminnum(){
        int k=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof admin){
                k++;
            }
        }
        return k;
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
