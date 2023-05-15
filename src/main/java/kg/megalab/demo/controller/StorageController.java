package kg.megalab.demo.controller;

import kg.megalab.demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StorageController {
    @Autowired
    private StorageService storageService;
    @GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String>getAllString(){
        return storageService.getList();
    }
    @PostMapping(value = "/add")
    public void addToList(@RequestParam String str){
        storageService.addToList(str);
    }
    @DeleteMapping(value = "/delete/{str}")
    public boolean deleteFromList(@PathVariable String str){
        return storageService.del(str);
    }
    @GetMapping(value = "/get/{str}")
    public boolean isExist(@PathVariable String str){
        return storageService.isExInList(str);
    }

}
