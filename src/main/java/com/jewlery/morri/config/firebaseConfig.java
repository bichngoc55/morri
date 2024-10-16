// package com.jewlery.morri.config;
// import com.google.auth.oauth2.GoogleCredentials;
// import com.google.cloud.firestore.Firestore;
// import com.google.cloud.firestore.v1.FirestoreClient;
// import com.google.firebase.FirebaseApp;
// import java.io.FileInputStream;
// import com.google.cloud.firestore.Firestore;

// import com.google.firebase.FirebaseOptions;
// import java.io.IOException;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class firebaseConfig {
//     @Bean
//     public FirebaseApp firebaseService() throws IOException {
//         FileInputStream serviceAccount = new FileInputStream("src/main/resources/serviceAccountKey.json");

//         FirebaseOptions options = new FirebaseOptions.Builder()
//                 .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                 .setDatabaseUrl(System.getenv("FIREBASE_DATABASE_URL"))
//                 .build();
                 

//         return FirebaseApp.initializeApp(options);

//     }
    
// }
