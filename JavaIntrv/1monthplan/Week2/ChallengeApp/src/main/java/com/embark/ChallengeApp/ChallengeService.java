package com.embark.ChallengeApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ChallengeService {
    private List<Challenge> challenges = new ArrayList<>();
    private long nextId = 1L;

    public ChallengeService(){
        // remove this initialisation, as it will assign index 1 to this one amd next posting 1 as well.
        Challenge challenge1 = new Challenge(1L, "January", "Learning again");
        challenges.add(challenge1);  
    }

    public List<Challenge> getAllChallenges(){
        return challenges;
    }
    public boolean addChallenge(Challenge challenge){
        if(challenge != null){
            challenge.setId(nextId++);
            challenges.add(challenge);
            return true;
        }
        else {
            return false;
        }
    }

    public Challenge getChallenges(String month) {
        for(Challenge challenge: challenges){
            if(challenge.getMonth().equalsIgnoreCase(month)){
                return challenge;
            }
        }
        return null;
    }

    boolean updateChallenge(Long id, Challenge updateChallenge) {
        for(Challenge challenge: challenges){
            if(challenge.getId().equals(id)){
                challenge.setMonth(updateChallenge.getMonth());
                challenge.setDescription(updateChallenge.getDescription());
                return true;
            }
        }
        return false;
    }

    boolean deleteChallenge(Long id) {
        return challenges.removeIf(challenges -> challenges.getId().equals(id));
    }
    
}
