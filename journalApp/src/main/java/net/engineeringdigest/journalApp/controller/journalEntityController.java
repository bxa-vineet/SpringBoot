package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/journal")
public class journalEntityController {

    HashMap<Long,JournalEntity> journal_data = new HashMap<>();
    @GetMapping("/getApi")
    public ArrayList<JournalEntity> get(){
        System.out.println(journal_data);
        return new ArrayList<>(journal_data.values());
    }

    @PostMapping("/postApi")
    public boolean post(@RequestBody JournalEntity myEntry){
        journal_data.put(myEntry.getId(),myEntry);
        System.out.println(journal_data);
        return true;
    }

    @GetMapping("/getApi/{myId}")
    public JournalEntity getById(@PathVariable Long myId){
        return journal_data.get(myId);
    }


    @DeleteMapping("/deleteApi/{myId}")
    public void  delete_By_Id(@PathVariable Long myId){
         journal_data.remove(myId);
    }

    @PutMapping("/putApi/{myId")
    public  JournalEntity  update_By_Id(@PathVariable Long myId,@RequestBody JournalEntity myEntry){
        return journal_data.put(myId,myEntry);
    }





}
