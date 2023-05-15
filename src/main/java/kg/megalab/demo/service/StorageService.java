package kg.megalab.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class StorageService {

    private List<String>list=new ArrayList<>();
    public List<String>getList(){
         return this.list;
    }
    public void addToList(String str){
        if (!containsStr(str)){
         list.add(str);
            log.info("String{}added to list",str);}
        else
            log.error("String {}didn't add",str);
    }
    public boolean del(String str){
        if (!containsStr(str)){
            log.error("String {} doesn't contain in list",str);
            return false;
        }
         list.remove(str);
         log.info("String {} DELETED from list",str);
        return true;
    }
    public boolean isExInList(String str){
        return containsStr(str);
    }
    public boolean containsStr(String str){
        return list.contains(str);
    }
}
