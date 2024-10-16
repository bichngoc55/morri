package com.jewlery.morri.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.google.cloud.firestore.WriteResult;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.v1.FirestoreClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.jewlery.morri.model.User;

@Service
public class userService { 
    //register
    public String registerUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

    //  DocumentReference docRef = db.collection("users").document("aturing");
        
     DocumentReference documentReference = db.collection("users").document(user.identityCard());
     ApiFuture<WriteResult> result = documentReference.set(user);
     return "User created at: " + result.get().getUpdateTime();
   return ("Update time : " + result.get().getUpdateTime());
    }

}
