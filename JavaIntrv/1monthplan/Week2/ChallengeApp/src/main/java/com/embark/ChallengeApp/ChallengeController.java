package com.embark.ChallengeApp;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChallengeController {
    private ChallengeService challengeService;
    private Challenge updateChallenge;

    public ChallengeController(ChallengeService challengeService){
        this.challengeService = challengeService;

    }
    // returns all the challenges
    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges(){
        return challengeService.getAllChallenges();
    }

    @PostMapping("/challenges")
    public String addChallenge(@RequestBody Challenge challenge){
        boolean isChallengeAdded = challengeService.addChallenge(challenge);
        if(isChallengeAdded){
            return "Challenge added successfully";    
        }
        else{
            return "Challenge not added successfully";
        }
    }
    // ResponseEntity wrapper-> represent http including status code & entity
    @GetMapping("/challenges/{month}")
    public ResponseEntity<Challenge> getChallenges(@PathVariable String month){
        Challenge challenge = challengeService.getChallenges(month);
        if(challenge != null){
            return new ResponseEntity<>(challenge, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
    }
    @PutMapping("/challenges/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable Long id, @RequestBody Challenge updatedChallenge){
        boolean isChallengeUpdated = challengeService.updateChallenge(id, updateChallenge);
        if(isChallengeUpdated){
            return new ResponseEntity<>("Challenge updated successfully", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Challenge not updated successfully", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/challenges/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id){
        boolean isChallengeDeleted = challengeService.deleteChallenge(id);
        if(isChallengeDeleted){
            return new ResponseEntity<>("Challenge deleted successfully", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Challenge not deleted successfully",HttpStatus.NOT_FOUND);
        }
    }
    
}
